import java.util.*;
/**
 *
 * @author 1600502
 */
public class BakingCompetition {
    HashMap<Baker, Cake> contestants;

    public BakingCompetition() {
        this.contestants = new HashMap<>();
    }
    
    public BakingCompetition(HashMap<Baker, Cake> contestant) {
        this.contestants = new HashMap<>();
        for (Map.Entry<Baker, Cake> pair : contestant.entrySet()) {
            this.contestants.put(pair.getKey(), pair.getValue());
        }
    }
    
    public void addContestant(Baker baker, Cake cake) {
        contestants.put(baker, cake);
    }
    
    public String getDetailsOf(Baker baker) {
        return baker.getName() + 
                    " baked a " + contestants.get(baker).getName() + 
                    " with " + contestants.get(baker).printIngredients() + 
                    " Its cooking time is " + contestants.get(baker).getCookingTime() + 
                    " minutes and it contains " + contestants.get(baker).getCalories() + " calories.\n";
    }
    
    public void printToString() {
        for (Map.Entry<Baker, Cake> pair : contestants.entrySet()) {
            System.out.println(pair.getKey().toString());
            pair.getValue().printInfo();
        }
    }
    
    public void printAllDetails() {
        for (Baker baker : contestants.keySet()) {
            System.out.println(baker.toString());
        }
    }
    
    public void printAllCakes() {
        for (Cake cake : contestants.values()) {
            System.out.println(cake.getInfo());
        }
    }
    
    public String CakeInfoOf(String ID) {
        String details = "";
        for (Map.Entry<Baker, Cake> pair : contestants.entrySet()) {
            if(pair.getKey().getID().equals(ID)) {
                details+= "Contestant " + ID + ":\n" + pair.getValue().getInfo() + "\n";
            }
        }
        return details;
    }
    
    public String noNuts() {
        String contents = "";
        for (Cake cake : contestants.values()) {
            if(!cake.hasNuts()) {
                contents+= cake.getName() + "\n";
            }
        }
        return contents;
    }
    
    public void printNoNuts() {
        System.out.println("The following cakes contain no nuts: ");
        System.out.println(noNuts());
    }
    
    public String cakesWith(String ingredient) {
        String cakes = "";
        for (Cake cake : contestants.values()) {
            if(cake.hasIngredient(ingredient)) {
                cakes+= cake.getName() + "\n";
            }
        }
        return cakes;
    }
    
    public void overCalorific(double calories) {
        for (Cake cake : contestants.values()) {
            if(cake.getCalories() > calories) {
                System.out.println(cake.getName());
            }
        }
    }
}
