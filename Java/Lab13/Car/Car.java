/**
 * This class stores the properties and
 * methods associated with a car
 * @author SIlviya Tacheva
 * @version 1.0 16/02/2017
 */
public class Car 
{
  /**
   * Surname of the person who owns the car
   */
  private String owner;
  
  /**
   * The make of the car
   */
  private String make;
  
  /**
   * The mileage of the car
   */
  private double mileage;
  
  /**
   * The fuel type of the car (petrol/diesel) 
   */
  private boolean isPetrol;
  
  /**
   * The constructor for the usedCar object
   * @param anOwner The name of the owner of the car
   * @param aMake The make of the car
   * @param aMileage The mileage of the car
   * @param petrol Determines the type of fuel (petrol/diesel)
   */
  public Car(String anOwner, String aMake, double aMileage, boolean petrol) 
  {
    owner = anOwner;
    make = aMake;
    mileage = aMileage;
    isPetrol = petrol;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the name of the owner of the car
   * @return The name of the owner
   */
  public String getOwner() 
  {
    return owner;
  }
  
  /**
   * Gets the make of the car
   * @return The make of the car
   */
  public String getMake() 
  {
    return make;
  }
  
  /**
   * Gets the mileage of the car
   * @return The mileage of the car
   */
  public double getMileage() 
  {
    return mileage;
  }
  
  /**
   * Gets the fuel type of the car
   * @return The fuel type of the car
   */
  public boolean getIsPetrol() 
  {
    return isPetrol;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Sets the name of the owner of the car
   * @param anOwner The owner of the car
   */
  public void setOwner(String anOwner) 
  {
    owner = anOwner;
  }
  
  /**
   * Sets the make of the car
   * @param aMake The make of the car
   */
  public void setMake(String aMake) 
  {
    make = aMake;
  }
    
  /**
   * Sets the mileage of the car
   * @param aMileage The mileage of the car
   */
  public void setMileage(double aMileage) 
  {
    mileage = aMileage;
  }
      
  /**
   * Sets the fuel type of the car
   * @param petrol The fuel type of the car
   */
  public void setIsPetrol(boolean petrol) 
  {
    isPetrol = petrol;
  }
  
  //------------Other Methods-----------------
  
  /**
   * Classifies the car`s milleage as low, medium or high
   * @return Classification of the car`s mileage
   */
  public String mileageClassification() 
  {
    String classification = "";
    if(mileage < 20000) 
    {
      classification = "low";
    }
    else if(mileage < 50000) 
    {
      classification = "medium";
    }
    else 
    {
      classification = "high";
    }
    
    if(classification == "high") 
    {
      System.out.println(2);
      displayWarning();
    }
    
    return classification;
  }
  
  /**
   * Determines what replacement the car needs
   * @return The component to be replaced
   */
  public String replacement() 
  {
    String replacement = "not needed";
    if(isPetrol && mileage > 75000) 
    {
      replacement = "spark plugs";
    }
    if(!isPetrol && mileage > 100000) 
    {
      replacement = "compressor valve";
    }
    return replacement;
  } 
  
  /**
   * Displays a warning when the mileage treshold (50000) is exceeded
   * @return A warning
   */
  public void displayWarning() 
  {
    System.out.println("THE CAR IS EXCEEDING ITS MILEAGE TRESHOLD!");    
  }
  
  /**
   * Returns a string representation of the contents of the fields of a UsedCar
   * @return Information in the fields of a UsedCar
   */
  public String toString() 
  {
    String contents = "Name of owner: " + getOwner();
    contents+= "\nMake: " + getMake();
    contents+= "\nMileage: " + getMileage();
    contents+= "\nFuel type of the car is petrol: " + getIsPetrol();
    contents+= "\nMileage classification: " + mileageClassification();
    contents+= "\nReplacement the car needs: " + replacement();
    
    if(mileageClassification() == "high") 
    {
      System.out.println(1);
      displayWarning();
    }
    return contents;
  }
}
