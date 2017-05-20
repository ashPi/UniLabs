/**
 * This class represents a used car
 * @author SIlviya Tacheva
 * @version 1.0 15/02/2017
 */
public class UsedCar 
{
  /**
   * The make of the car
   */
  private String make;
  
  /**
   * The model of the car 
   */
  private String model;
  
  /**
   * The colour of the car 
   */
  private String colour;
  
  /**
   * The licence number of the car
   */
  private String licenceNumber;
  
  /**
   * The mileage of the car
   */
  private double mileage;
  
  /**
   * The fuel type of the car 
   */
  private String fuelType;
  
  /**
   * The constructor for the usedCar object
   * @param aMake The make of the car
   * @param aModel The model of the car
   * @param aColour The colour of the car
   * @param aLicenceNum The licence number of the car
   * @param aMileage The mileage of the car
   * @param aFuelType The fuel type of the car
   */
  public UsedCar(String aMake, String aModel, String aColour, String aLicenceNum, double aMileage, String aFuelType) 
  {
    make = aMake;
    model = aModel;
    colour = aColour;
    licenceNumber = aLicenceNum;
    mileage = aMileage;
    fuelType = aFuelType;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the make of the car
   * @return The make of the car
   */
  public String getMake() 
  {
    return make;
  }
  
  /**
   * Gets the model of the car
   * @return The model of the car
   */
  public String getModel() 
  {
    return model;
  }
  
  /**
   * Gets the colour of the car
   * @return The colour of the car
   */
  public String getColour()
  {
    return colour;
  }
  
  /** 
   * Gets the licence number of the car
   * @return The licence number of the car
   */
  public String getLicenceNumber() 
  {
    return licenceNumber;
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
  public String getFuelType() 
  {
    return fuelType;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Sets the make of the car
   * @param aMake The make of the car
   */
  public void setMake(String aMake) 
  {
    make = aMake;
  }
    
  /**
   * Sets the model of the car
   * @param aModel The model of the car
   */
  public void setModel(String aModel) 
  {
    model = aModel;
  }
    
  /**
   * Sets the colour of the car
   * @param aColour The colour of the car
   */
  public void setColour(String aColour) 
  {
    colour = aColour;
  }
    
  /**
   * Sets the licence number of the car
   * @param aLicenceNum The licence number of the car
   */
  public void setLicenceNumber(String aLicenceNum) 
  {
    licenceNumber = aLicenceNum;
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
   * @param afuelType The fuel type of the car
   */
  public void setFuelType(String aFuelType) 
  {
    fuelType = aFuelType;
  }
  
  //------------Other Methods-----------------
  
  /**
   * Returns a string representation of the contents of the fields of a UsedCar
   * @return Information in the fields of a UsedCar
   */
  public String toString() 
  {
    String contents = "Make of the car is " + getMake();
    contents+= "\nModel of the car is " + getModel();
    contents+= "\nColour of the car is " + getColour();
    contents+= "\nLicence number of the car is " + getLicenceNumber();
    contents+= "\nMileage of the car is " + getMileage();
    contents+= "\nFuel type of the car is " + getFuelType();
    return contents;
  }
}
