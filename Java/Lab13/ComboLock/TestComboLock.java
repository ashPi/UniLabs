/**
 * A Test Class for ComboLock Class
 * @author Silviya Tacheva 
 * @version 1.0 17/02/2017
 */
public class TestComboLock 
{
  public static void main(String[] args) 
  {
    //Create an instance of the ComboLock class
    ComboLock myLock = new ComboLock();
    
    //Test the getters
    System.out.printf("The current values of the lock numbers are: %d:%d:%d\n", 
                      myLock.getSecret1(), myLock.getSecret2(), myLock.getSecret3());
    
    //Test the set() methods 
    myLock.turnSecret1(3);
    myLock.turnSecret2(15);
    myLock.turnSecret3(39);
    System.out.printf("The new values of the lock numbers are: %d:%d:%d\n", 
                      myLock.getSecret1(), myLock.getSecret2(), myLock.getSecret3());
    myLock.turnSecret1(-5);
    
    //Test other methods
    System.out.println("The lock is open: " + myLock.open());
 
    myLock.reset();
    
    System.out.println(myLock.toString());
    myLock.turnSecret1(7);
    myLock.turnSecret2(14);
    myLock.turnSecret3(39);
    System.out.println("The lock is open: " + myLock.open());
    
  } //end of main() method
} //end of Test Class