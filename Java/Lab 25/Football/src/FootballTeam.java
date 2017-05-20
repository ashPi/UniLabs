import java.util.*;
/**
 *
 * @author s4et0
 */
public class FootballTeam {
    private ArrayList<Player> team;
    private String name;
    private String kit;
    private String manager;

    public FootballTeam() {
        this.team = new ArrayList<>();
        this.name = "not set";
        this.kit = "not set";
        this.manager = "not set";
    }

    public FootballTeam(ArrayList<Player> team, String name, String kit, String manager) {
        this.team = new ArrayList<>();
        for(int i = 0; i < team.size(); i++) {
            this.team.add(team.get(i));
        }
        this.name = name;
        this.kit = kit;
        this.manager = manager;
    }

    public ArrayList<Player> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Player> team) {
        for(int i = 0; i < team.size(); i++) {
            this.team.add(team.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    
    public String getPlayerList() {
        String players = "";
        for (Player player : team) {
            players+= player.getName() + "\n";
        }
        return players;
    }
    
    public void addPlayer(Player player){
        team.add(player);
    }
    public void removePlayer(Player player){
        team.remove(player);
    }
    
    @Override
    public String toString(){
        String output = "";
        output += "Name of team is " + getName() +"\n";
        output += "Manager is " + getManager() +"\n";
        output += "The kit is " + getKit() + "\n";
        output += "The players in the team are:\n" + getPlayerList();
        return output;
    }
    
    public int getTeamGoals() {
        int total = 0;
        for (Player player : team) {
            total+= player.getGoalsScored();
        }
        return total;
    }   
    
    public int getTeamPenalties() {
        int total = 0;
        for (Player player : team) {
            total+= player.getPoints().getPenaltyPoints();
        }
        return total;
    }
    
    public String fairPlayClassification() {
        String classification;
        if(getTeamPenalties() < 20) {
            classification = "high";
        }
        else if(getTeamPenalties() > 20 && getTeamPenalties() < 50) {
            classification = "medium";
        }
        else {
            classification = "low";
        }
        return classification;
    }
    
    public double getTeamValue() {
        double total = 0;
        for (Player player : team) {
            total+= player.getTransferFee();
        }
        return total;
    }
    
    public double getTransferablesValue() {
        double total = 0;
        for (Player player : team) {
            if(player.isTransferable()) {
                total+= player.getTransferFee();
            }
        }
        return total;
    }
}