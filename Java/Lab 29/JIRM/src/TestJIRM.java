import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestJIRM {
    public static void main(String[] args) {
        /*Contestant fluffy = new Contestant("Fluffy", 1.5);
        Contestant bigEars = new Contestant("Big Ears", 1.4);
        Contestant floppy = new Contestant("Floppy", 0.4);*/
        
        /*HashMap<Contestant, Owner> map = new HashMap<>();
        map.put(fluffy, roger);
        map.put(bigEars, mark);
        map.put(floppy, roger);
        
        Competition jirm = new Competition(map);
        System.out.println(jirm.toString());
        ArrayList<Contestant> owned = jirm.contestantsOf(roger);
        System.out.println("Roger`s contestants: " + owned.size());
        for (Contestant contestant : owned) {
            System.out.println(contestant.toString());
        }*/
        //RABITS***********************************************************
        Rabbit thumper = new Rabbit("Thumper", 1.3, "Lop", "White");
        Rabbit bluebell = new Rabbit("Bluebell", 0.7, "Angora", "Black");
        Rabbit fiver = new Rabbit("Fiver", 2.2, "Marburger", "Lilac");
        //PIGS*************************************************************
        GuineaPig buttercup = new GuineaPig("Buttercup", 0.8, "Short");
        GuineaPig lunch = new GuineaPig("Lunch", 1.1, "Short");
        GuineaPig fifi = new GuineaPig("Fifi", 0.4, "Long");
        //OWNERS***********************************************************
        Owner roger = new Owner("Roger", "British", true);
        Owner mark = new Owner("Mark", "Maltese", false);
        Owner john = new Owner("John", "Irish", false);
        
        HashMap<Contestant, Owner> map = new HashMap<>();
        map.put(thumper, roger);
        map.put(bluebell, mark);
        map.put(fiver, john);
        map.put(buttercup, roger);
        map.put(lunch, mark);
        map.put(fifi, john);
        
        Competition jirm = new Competition(map);
        System.out.println(jirm.toString());
        
    }
}
