import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestFiveASideTeam {
    public static void main(String[] args) {
        FiveASideTeam rockers = new FiveASideTeam();
        System.out.println(rockers.toString());
        ArrayList<String> players = new ArrayList<>();
        players.add("Soso");
        
        players.add("Vovo");
        
        rockers.setPlayers(players);
        rockers.addPlayer("Momo");
        rockers.addPlayer("Ello", 0);
        rockers.addPlayer("Koko", 3);
        System.out.println(rockers.getPlayers().toString());
        System.out.println("Removing Koki: " + rockers.removePlayer("Koki"));
        System.out.println("Removing Koko: " + rockers.removePlayer("Koko"));
        rockers.setColour("rainbow");
        rockers.setGoalDifference(14);
        rockers.setRmgb(true);
        System.out.println(rockers.toString());
        System.out.println("Searching for Svosvo: " + rockers.searchPlayer("Svosvo"));
        rockers.replacePlayer("Ello", "Svosvo");
        System.out.println(rockers.getPlayers().toString());
        rockers.isCompeting();
        rockers.setRmgb(false);
        rockers.isCompeting();
    }
    
}
