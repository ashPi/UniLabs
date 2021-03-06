/** 
 * A Test Class for the Oblong Class 
 * @author Roger McDermott 
 * @version 1.1 25/01/2013 
 */ 

public class TestOblong{ 
  
  public static void main(String [] args){ 
    // Create an instance of Oblong  
    // with length 10.0 and width 5.5 
    Oblong ob1 = new Oblong(10.0,5.5); 
    
    // Test the getters 
    System.out.println("Length is " + ob1.getLength()); 
    System.out.println("Width is " + ob1.getWidth()); 
    
    // Test the setters  
    ob1.setLength(20.0); 
    System.out.println("Length is " + ob1.getLength()); 
    ob1.setWidth(2.75); 
    System.out.println("Width is " + ob1.getWidth()); 
    
    // Test the calculateArea method 
    System.out.println("Area is " + ob1.calculateArea()); 
    
    //Test the calculatePerimeter method
    //Should print 45.5
    System.out.println("Perimeter is " + ob1.calculatePerimeter());
    
    // Test the toString method 
    System.out.println(ob1.toString()); 
    
  }  // End of main method 
}  // End of Test Class 
