/**
 * A class which stores the properties and methods associated with a room
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class Room 
{
  
  /**
   * The number of the room
   */
  private int number;
  
  /**
   * The length of the room
   */
  private double length;
  
  /**
   * The breadth of the room
   */
  private double breadth;
  
  /**
   * The height of the room
   */
  private double height;
  
  /**
   * The number of occupants of the room
   */
  private int occupants;
  
  /**
   * Constructor for the Room object
   * @param aNumber The number of the room
   * @param aLength The length of the room
   * @psram aBreadth The breadth of the room
   * @param aHeight The height of the room
   * @param occuppantsNum The number of occupants of the room
   */
  public Room(int aNumber, double aLength, double aBreadth, double aHeight, int occupantsNum) 
  {
    number = aNumber;
    length = aLength;
    breadth = aBreadth;
    height = aHeight;
    occupants = occupantsNum;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the number of the room
   * @return The number of the room
   */
  public int getNumber() 
  {
    return number;
  }
    
  /**
   * Gets the length of the room
   * @return The length of the room
   */
  public double getLength() 
  {
    return length;
  }
    
  /**
   * Gets the breadth of the room
   * @return The breadth of the room
   */
  public double getBreadth() 
  {
    return breadth;
  }
    
  /**
   * Gets the height of the room
   * @return The height of the room
   */
  public double getHeight() 
  {
    return height;
  }
    
  /**
   * Gets the number of occupants of the room
   * @return The number of occupants of the room
   */
  public int getOccupants() 
  {
    return occupants;
  }
  
  //------------Setter Methods-----------------
    
  /**
   * Sets the number of the room
   * @param aNumber The number of the room
   */
  public void setNumber(int aNumber) 
  {
    number = aNumber;
  }
    
  /**
   * Sets the length of the room
   * @param aLength The length of the room
   */
  public void setLength(double aLength) 
  {
    length = aLength;
  }
    
  /**
   * Sets the breadth of the room
   * @param aBreadth The breadth of the room
   */
  public void setBreadth(double aBreadth) 
  {
    breadth = aBreadth;
  }
    
  /**
   * Sets the height of the room
   * @param aHeigth The height of the room
   */
  public void setHeight(double aHeight) 
  {
    height = aHeight;
  }
    
  /**
   * Sets the number of occupants of the room
   * @param occupantsNum The number of occupants of the room
   */
  public void setOccupants(int occupantsNum) 
  {
    occupants = occupantsNum;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Calculates the floor space of the room
   * @return The floor space of the room
   */
  public double calculateFloorSpace() 
  {
    return this.getLength() * this.getBreadth();
  }
  
  /**
   * Calculates the volume of the room
   * @return The volume of the room
   */
  public double calculateVolume() 
  {
    return this.calculateFloorSpace() * this.getHeight(); 
  }
  
  /**
   * Calculates the floor space per occupant
   * @return The floor space per occupant
   */
  public double occupantFloorSpace() 
  {
    return this.calculateFloorSpace() / occupants;
  }
  
  /**
   * Returns a string representation of the contents of the fields in a Room object
   * @return The information in the fields of a Room
   */
  public String toString() 
  {
    String contents = "The number of the room is " + getNumber();
    contents+= "\nThe length of the room is " + getLength();
    contents+= "\nThe breadth of the room is " + getBreadth();
    contents+= "\nThe height of the room is " + getHeight();
    contents+= "\nThe number of occupants of the room is " + getOccupants();
    contents+= "\nThe volume of the room is " + calculateVolume();
    contents+= "\nThe floor space of the room is " + calculateFloorSpace();
    contents+= "\nThe floor space per occupant is " + occupantFloorSpace();
    return contents;
  }
}