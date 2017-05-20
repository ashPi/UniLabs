/**
 * This is a class which stores information
 * about the type of pizza a company stocks.
 * @author Silviya Tacheva
 * @version 1.0 15.03.2017 
 */

public class Pizza 
{
  //=====================FIELDS==============================================================
  private String name; // The name of the pizza
  private double price; // The price of the pizza
  private String size; // The size of a pizza: small- 7inch, medium- 12inch or large- 15inch
  private String spiciness; // Whether it`s mild, moderate or hot
  private boolean vegetarian; // Whether it`s suitable for vegetarians or not
  
  //-------------------Constructors----------------------------------------------------------
  /**
   * A constructor for initialising the attributes
   * of the Pizza object with custom values
   * @param aName The value to assign to the name field
   * @param aPrice The value to assign to the price field
   * @param aSize The value to assign to the price field
   * @param aSpiciness The value to assign to the spiciness field
   * @param a=isVegetarian The value to assign to the vegetarian field
   */
  public Pizza(String aName, double aPrice, String aSize, String aSpiciness, boolean isVegetarian) 
  {
    name = aName;
    price = aPrice;
    size = aSize;
    spiciness = aSpiciness;
    vegetarian = isVegetarian;
  }
  
  
  /**
   * A constructor for initialising the attributes
   * of the Pizza object with default values
   */
  public Pizza() 
  {
    name = "Margherita";
    price = 4.99;
    size = "small";
    spiciness = "Mild";
    vegetarian = true;
  }
  //-------------------Getter Methods-------------------------------------------------------
  
  /**
   * Gets the name of the pizza
   * @return name The name of the pizza
   */
  public String getName() 
  {
    return name;
  }
  
  /**
   * Gets the price of the pizza
   * @return price The price of the pizza
   */
  public double getPrice() 
  {
    return price;
  }
  
  /**
   * Gets the size of the pizza in inches
   * @return size The size of the pizza in inches
   */
  public int getSize() 
  {
    int inches;
    if (size == "small") 
    {
      inches = 7;
    }
    else if (size == "mediaum") 
    {
      inches = 12;
    }
    else 
    {
      inches = 15;
    }
    return inches;
  }
  
  /**
   * Gets the spiciness of the pizza
   * @return spiciness The spiciness of the pizza
   */
  public String getSpiciness() 
  {
    return spiciness;
  }
  
  /**
   * Gets whether the pizza is vegetarian or not
   * @param vegetarian Whether the pizza is vegetarian or not
   */
  public boolean getVegetarian() 
  {
    return vegetarian;
  }
  
  
   //-------------------Setter Methods-------------------------------------------------------
  
  /**
   * Sets the name of the pizza
   * @param name The name of the pizza
   */
  public void setName(String name) 
  {
    this.name = name;
  }
  
  /**
   * Sets the price of the pizza
   * @param price The price of the pizza
   */
  public void setPrice(double price) 
  {
    this.price = price;
  }
  
  /**
   * Sets the size of the pizza given in inches
   * @param size The size of the pizza in inches
   */
  public void setSize(int size) 
  {
    if(size == 7) 
    {
      this.size = "small";
    }
    else if (size == 12) 
    {
      this.size = "medium";
    }
    else 
    {
      this.size = "large";
    }
  }
  
  /**
   * Sets the size of the pizza given as a word
   * @param size The size of the pizza
   */
  public void setSize(String size) 
  {
    this.size = size;
  }
  
  /**
   * Sets the spiciness of the pizza
   * @param spiciness The spiciness of the pizza
   */
  public void setSpiciness(String spiciness) 
  {
    this.spiciness = spiciness;
  }
  
  /**
   * Sets whether the pizza is vegetarian or not
   * @param vegetarian Whether the pizza is vegetarian or not
   */
  public void setVegetarian(boolean vegetarian) 
  {
    this.vegetarian = vegetarian;
  }
  
  //-------------------Other Methods-------------------------------------------------------
  
  /**
   * Returns a summary of the information
   * contained in the fields of a Pizza object
   * @return summary A summary of the pizza information
   */
  public String toString() 
  {
    String summary = "Name: " + getName();
    summary+= "\n Price(?) " + getPrice();
    summary+= "\n Size(inch): " + getSize();
    summary+= "\n Spiciness: " + getSpiciness();
    summary+= "\n Vegetarian: ";
    if(getVegetarian()) 
    {
      summary+= "Yes";
    }
    else 
    {
      summary+= "No";
    }
    return summary;
  }
}