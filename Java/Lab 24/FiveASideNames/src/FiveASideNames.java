import java.util.*;
/**
 *
 * @author s4et0
 */
public class FiveASideNames {
    private ArrayList<String[]> players;
    private String colour;
    private int goalDifference;
    private boolean rmgb;

    public FiveASideNames() {
        this.players = new ArrayList<>();
        this.colour = "Not assigned";
        this.goalDifference = 0;
        this.rmgb = false;
    }

    public ArrayList<String[]> getPlayers() {
        return players;
    }

    /*public void setPlayers(ArrayList<String[]> names) {
        for(int i = 0; i < names.size(); i++) {
            this.players.add(names.get(i));
        }
    }*/

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public boolean isRmgb() {
        return rmgb;
    }

    public void setRmgb(boolean rmgb) {
        this.rmgb = rmgb;
    }

    @Override
    public String toString() {
        String contents = "FiveASideTeam{" + "players=";
        for(int i = 0; i < players.size(); i++) {
           contents+= "[ " + players.get(i)[0].toString() + players.get(i)[1].toString() + "] ";
        }
        contents+= ", colour=" + colour + ", goalDifference=" + goalDifference + ", rmgb=" + rmgb + '}';
        return contents;
    }
    
    public void addPlayer(String[] player) {
        players.add(player);
    }
    
    public void addPlayer(String[] player, int position) {
        players.add(position + 1, player);
    }
    
    public boolean removePlayer(String player) {
        boolean removed = false;
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i)[0].equals(player)) {
                players.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    
    public boolean searchPlayer(String player) {
        boolean found = false;
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i)[0].equals(player)) {
                found = true;
                break;
            }
        }
        return found;
    }
    
    public void replacePlayer(String[] oldPlayer, String[] newPlayer) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i)[0].equals(oldPlayer[0])) {
                players.set(i, newPlayer);
                break;
            }
        }
    }
    
    public void isCompeting() {
        if(isRmgb()) {
            System.out.println("The team is still in the RMGB 5-a-side Challenge Trophy");
        }
        else {
            System.out.println("The team is out of the RMGB 5-a-side Challenge Trophy");
        }
    }
}
