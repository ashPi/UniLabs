import java.util.*;
/**
 *
 * @author 1600502
 */
public class TestBakingCompetition {
    public static void main(String[] args) {
        HashSet<String> ingr = new HashSet<>();
        ingr.add("flour");
        ingr.add("sugar");
        ingr.add("vanilla");
        ingr.add("lemon");
        ingr.add("sugar");
        ingr.add("eggs");
        //Cake
        Cake lemonCake = new Cake("Lemon Cake", 150, 350, ingr);
        System.out.println(lemonCake.getInfo());
        lemonCake.printInfo();
        lemonCake.removeIngredient("vanilla");
        lemonCake.printInfo();
        lemonCake.addIngredient("nuts");
        lemonCake.printInfo();
        //Roger
        Baker roger = new Baker("Roger", "100");
        System.out.println(roger.toString());
        HashMap<Baker,Cake> contestant = new HashMap<>();
        contestant.put(roger, lemonCake);
        //John
        Baker john = new Baker("John", "101");
        ingr.clear();
        ingr.add("flour");
        ingr.add("eggs");
        ingr.add("nuts");
        ingr.add("carrots");
        ingr.add("sugar");
        lemonCake = new Cake("Carrot Cake", 60, 500, ingr);
        contestant.put(john, lemonCake);
        //mark
        Baker mark = new Baker("Mark", "102");
        ingr.clear();
        ingr.add("eggs");
        ingr.add("fish");
        ingr.add("salt");
        ingr.add("breadcrumbs");
        lemonCake = new Cake("Fish Cake", 15, 250, ingr);
        contestant.put(mark, lemonCake);
        //David
        Baker david = new Baker("David", "103");
        ingr.clear();
        ingr.add("flour");
        ingr.add("eggs");
        ingr.add("nuts");
        ingr.add("raisins");
        ingr.add("sugar");
        ingr.add("brandy");
        lemonCake = new Cake("Wedding Cake", 120, 750, ingr);
        contestant.put(david, lemonCake);
        //Yang
        Baker yang = new Baker("Yang", "104");
        ingr.clear();
        ingr.add("flour");
        ingr.add("eggs");
        ingr.add("butter");
        ingr.add("cocoa");
        ingr.add("sugar");
        lemonCake = new Cake("Carrot Cake", 45, 800, ingr);
        contestant.put(yang, lemonCake);
        //Competition
        BakingCompetition competition = new BakingCompetition(contestant);
        System.out.println("\n\n" + competition.getDetailsOf(david));
        System.out.println("\nAll contestants details: ");
        competition.printAllDetails();
        System.out.println("\nAll cakes in the competition: ");
        competition.printAllCakes();
        System.out.println("\nDetails by ID: " + competition.CakeInfoOf("102"));
        System.out.println("nNo nuts print: ");
        competition.printNoNuts();
        System.out.println("\nAll cakes with flour are: " + competition.cakesWith("flour"));
        System.out.println("\nAll info about everything: ");
        competition.printToString();
        System.out.println("\nCakes over 300 cal: ");
        competition.overCalorific(300);
    }
    
}
