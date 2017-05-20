/**
 * A Test Class for the Bug Class
 * @author Silviya Tacheva
 * @vrsion 1.0 17/02/2017
 */
public class TestBug 
{
  public static void main(String[] args) 
  {
    // Creates an instance of the Bug class
    // with initial position 50;
    Bug buggy = new Bug(50);
    
    //Test toStrig() method
    //System.out.println(buggy.toString());
    
    //Test the field() method
    System.out.println(buggy.field());
    
    //Test the move() method
    //System.out.println("First move: ");
    buggy.move(51);
    //System.out.println("Second move: ");
    buggy.move(27);
    System.out.println(buggy.field());
    //System.out.println("Turn: ");
    buggy.turn();
    System.out.println(buggy.field());
    
    //Test getters
    /*System.out.println("Direction: " + buggy.getDirection());
    System.out.println("Position: " + buggy.getPosition());
    
    System.out.println("Third move: ");*/
    buggy.move(69);
    System.out.println(buggy.field());
    
    //System.out.println("Turn: ");
    buggy.turn();
    System.out.println(buggy.field());
    
    //System.out.println("Fourth move: ");
    buggy.move(11);
    System.out.println(buggy.field());
  }
}