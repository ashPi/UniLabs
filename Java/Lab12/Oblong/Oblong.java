/** 
 * A model of an oblong 
 * @author Roger McDermott 
 * @version 1.1 25/01/2017 
 */ 

public class Oblong{ 
  
  /**  
   * The length of the rectangle  
   */ 
  private double length; 
  
  /**  
   * The width of the rectangle  
   */ 
  private double width; 
  
  /** 
   * The constructor for the oblong objects 
   * @param aLength The length of the rectangle 
   * @param aWidth The width of the rectangle 
   */  
  public Oblong(double aLength, double aWidth){ 
    length = aLength; 
    width = aWidth; 
  } 
  
  //------------Getter Methods----------------- 
  
  /** 
   * Gets the length 
   * @return The length of the rectangle 
   */ 
  public double getLength(){ 
    return length; 
  } 
  
  /** 
   * Gets the width 
   * @return The width of the rectangle 
   */ 
  public double getWidth(){ 
    return width; 
  } 
  //------------Setter Methods----------------- 
  
  /** 
   * Sets the length 
   * @param aLength The length of the rectangle 
   */ 
  public void setLength(double aLength){ 
    length = aLength; 
  } 
  
  /** 
   * Sets the width 
   * @param aWidth The width of the rectangle 
   */ 
  public void setWidth(double aWidth){ 
    width = aWidth; 
  } 
  
  //------------Other Methods----------------- 
  
  /** 
   * Calculates the area
   * @return The area of the rectangle 
   */ 
  public double calculateArea(){ 
    return length * width; 
  } 
  
  /**
   * Calculates the perimeter of the oblong
   * @return the perimeter of the oblong
   */
  public double calculatePerimeter()
  {
    return 2 * (length + width);
  }
  
  /** 
   * toString Method
   * @return The information contained in the fields
   */ 
  public String toString(){ 
    String str = "Length is " + getLength() 
      + " , Width is " + getWidth() 
      + " , Area is " 
      + calculateArea() 
      + " and Perimeter is "
      + calculatePerimeter();
    return str;
  } 
    
} 

 

