/**
 * A Test Class for the CIrcle Class
 * @author Silviya Tacheva
 * @version 1.0 15/02/2017
 */
public class TestCircle 
{
  public static void main(String[] args) 
  {
    //Create an instance of Circle 
    //with radius 1.5
    Circle circ = new Circle(1.5);
    
    //Test the getRadius() method
    //Should print 1.5
    System.out.println("The radius of the circle is " + circ.getRadius());
    
    //Test the setRadius() method 
    //Should print 2.5
    circ.setRadius(2.5);
    System.out.println("The raius of the circle is " + circ.getRadius());
    
    //Test the calculateArea() method
    //Should print 19.625
    System.out.println("The area of the circle is " + circ.calculateArea());
    
    //Test the calculateCircumference() method
    //Should print 15.7
    System.out.printf("The circumference of the circle is %.2f\n", circ.calculateCircumference());
    
    //Test the toString() method
    System.out.println(circ.toString());
    
  } //end of main() method
  
} //end of Test Class