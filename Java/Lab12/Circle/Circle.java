/**
 * A model of a circle
 * @author Silviya Tacheva
 * @version 1.0 15/02/2017
 */

public class Circle 
{
  
  /**
   * The radius of the circle
   */
  private double radius;
  private final double PI_VALUE = 3.14;
  /**
   * The constructor for the Circle object
   * @param aRadius The radius of the circle
   */
  public Circle(double aRadius) 
  {
    radius = aRadius;
  }
  
  //------------Getter Methods----------------- 
  
  /**
   * Gets the radius
   * @return The radius of the circle
   */
  public double getRadius() 
  {
    return radius;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Sets the radius of the circle
   * @param aRadius The radius of the circle
   */
  public void setRadius(double aRadius) 
  {
    radius = aRadius;
  }
  
  //------------Other Methods-----------------
  
  /**
   * Calculates the area of the circle
   * @return The area of the circle
   */
  public double calculateArea() 
  {
    return PI_VALUE * radius * radius;
  }
  
  /**
   * Calculates the circumference of the circle
   * @return The circumference of the circle
   */
  public double calculateCircumference() 
  {
    return PI_VALUE * 2 * radius;
  }
  
  /**
   * Returns a string representation of the contents of the fields of the Circle
   * @return The information contained in the fields
   */
  public String toString() 
  {
    String contents = "Radius of the circle is " + getRadius();
    contents+= "\nArea of the circle is " + calculateArea();
    contents+= "\nCircumference of the circle is " + calculateCircumference();
    return contents;
  }
}