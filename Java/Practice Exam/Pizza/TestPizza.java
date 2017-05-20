/**
 * A Test class for the Pizza class
 * @author Silviya Tacheva
 * @version 1.0 15.03.2017
 */
public class TestPizza 
{
  public static void main (String[] args) 
  {
    Pizza myPizza = new Pizza(); //Creating an instance of the pizza class with the default constructor
    System.out.println(myPizza.toString());    //Testing the toString method
    // Should print
    //Name: Margherita
    //Price(): 4.99
    //Size(inch): 7
    //Spiciness: Mild
    //Vegetaria: Yes
    
    myPizza = new Pizza("Spicy Beef", 5.99, "medium", "Hot", false); //Testing the constructor with custom values
    //Testing the getters
    System.out.println("Name:" + myPizza.getName());
    System.out.println("Price:" + myPizza.getPrice());
    System.out.println("Size:" + myPizza.getSize());
    System.out.println("Spiciness:" + myPizza.getSpiciness());
    System.out.println("Vegetarian:" + myPizza.getVegetarian());
    // Should print
    //Name: Spicy Beef
    //Price(): 5.99
    //Size(inch): 12
    //Spiciness: Hot
    //Vegetaria: false
    
    //Testing the setters
    myPizza.setName("Barbecue Chicken");
    myPizza.setPrice(7.99);
    myPizza.setSize(15);
    myPizza.setSpiciness("Moderate");
    myPizza.setVegetarian(false);
    
    System.out.println(myPizza.toString());
    // Should print
    //Name: Barbecue Chicken
    //Price(): 7.99
    //Size(inch): 15
    //Spiciness: Moderate
    //Vegetaria: No
    
    //Testing the size setter with a String
    myPizza.setSize("small");
    System.out.println(myPizza.getSize()); //Should display 7
  } //End of main()
} //End of Test class