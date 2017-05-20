import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestFiveASideNames {
    public static void main(String[] args) {
        FiveASideNames rockers = new FiveASideNames();
        System.out.println(rockers.toString());
        ArrayList<String[]> players = new ArrayList<>();
        String[] names = new String[2];
        names[0] = "Soso";
        names[1] = "Toch";
        rockers.addPlayer(names);
        System.out.println(rockers.toString());
        names[0] = "Vovo";
        names[1] = "Yok";
        rockers.addPlayer(names);
        //rockers.setPlayers(players);
        System.out.println(rockers.toString());
        names[0] = "Momo";
        names[1] = "Monk";
        rockers.addPlayer(names);
        System.out.println(rockers.toString());
        names[0] = "Ello";
        names[1] = "Ton";
        rockers.addPlayer(names, 0);
        System.out.println(rockers.toString());
        names[0] = "Koko";
        names[1] = "M";
        rockers.addPlayer(names, 3);
        System.out.println(rockers.toString());
        System.out.println("Removing Koki: " + rockers.removePlayer("Koki"));
        System.out.println("Removing Koko: " + rockers.removePlayer("Koko"));
        rockers.setColour("rainbow");
        rockers.setGoalDifference(14);
        rockers.setRmgb(true);
        System.out.println(rockers.toString());
        System.out.println("Searching for Svosvo: " + rockers.searchPlayer("Svosvo"));
        String[] newNames = {"Svosvo", "Koncho"};
        names[0] = "Ello";
        names[1] = "Ton";
        rockers.replacePlayer(names, newNames);
        System.out.println(rockers.getPlayers().toString());
        rockers.isCompeting();
        rockers.setRmgb(false);
        rockers.isCompeting();
    }
    
}
