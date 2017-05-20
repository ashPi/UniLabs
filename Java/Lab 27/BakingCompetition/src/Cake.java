import java.util.*;
/**
 *
 * @author 1600502
 */
public class Cake {
    private String name;
    private int cookingTime;
    private double calories;
    private HashSet<String> ingredients;

    public Cake(String name, int cookingTime, double calories, HashSet<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.calories = calories;
        this.ingredients = new HashSet<>();
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }
    
    public Cake() {
        this.name = "Not assigned";
        this.cookingTime = 0;
        this.calories = 0;
        this.ingredients = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public HashSet<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashSet<String> ingredients) {
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public void removeIngredient(String ingredient) {
        if(this.ingredients.contains(ingredient)) {
            this.ingredients.remove(ingredient);
        }
    }
    
    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }
    
    public boolean hasNuts() {
        return hasIngredient("nuts");
    }
    
    
    
    public String getInfo() {
        String contents = "This is a " + getName() + ". ";
        contents+= "It has a cooking time of " + getCookingTime() + " minutes and contains " + getCalories() + " calories.";
        return contents;
    }
    
    public String printIngredients() {
        String list = "";
        for (Object ingredient : ingredients) {
            list+= ingredient + ", "; 
        }
        return list;
    }
    
    public void printInfo() {
        System.out.println(getInfo());
        System.out.print("Ingredients list: " + printIngredients());
        System.out.println("\nThe cake " + (hasNuts() ? "contains" : "does not contain") + " nuts.");
    }
}
