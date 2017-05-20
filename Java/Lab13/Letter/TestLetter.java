/**
 * A Test Class for the Letter Class
 * @author Silviya Tacheva
 * @version 1.0 17/02/2017
 */
public class TestLetter 
{
  public static void main(String[] args) 
  {
    // Creates a new instance of the Letter class
    // with sender "Mary"
    // and recepient "John"
    Letter myLetter = new Letter("Sisi", "Vicky");
    
    //Test the getter methods 
    System.out.println("The letter is from " + myLetter.getSender() + " to " + myLetter.getRecepient());
    
    //Test the setter methods
    myLetter.setSender("Mary");
    myLetter.setRecepient("John");
    System.out.println("The letter now is from " + myLetter.getSender() + " to " + myLetter.getRecepient() + ":\n");
    
    //Test the other methods
    myLetter.addLine("I am sorry we must part.");
    myLetter.addLine("I wish you all the best.");
    
    System.out.println(myLetter.getText());
  }
}