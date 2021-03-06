/**
 * A class that stores the properties and methods
 * associated with a combination lock
 * @author Silviya Tacheva
 * v 1.0 17/02/2017
 */
public class ComboLock 
{
  /**
   * The correct combination for the lock
   */
  private final int[] combination = {7, 14, 39};
  
  /**
   * First number of the lock combination [0;39]
   */
  private int secret1;
  
  /**
   * Second number of the lock combination [0;39]
   */
  private int secret2;
  
  /**
   * Third number of the lock combination [0;39]
   */
  private int secret3;
  
  /**
   * Constructor for the ComboLock object
   */
  public ComboLock() 
  {
    secret1 = 0;
    secret2 = 0;
    secret3 = 0;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the corret lock combination
   * @return The correct lock combination
   */
  public int[] getCombination() 
  {
    return combination;
  }
  
  /**
   * Gets the first number of the lock combination
   * @return The fist number of the combination
   */
  public int getSecret1() 
  {
    return secret1;
  }
  
  /**
   * Gets the second number of the lock combination
   * @return The second number of the combination
   */
  public int getSecret2() 
  {
    return secret2;
  }
  
  /**
   * Gets the third number of the lock combination
   * @return The third number of the combination
   */
  public int getSecret3() 
  {
    return secret3;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Resets the three numbers of the lock
   */
  public void reset() 
  {
    secret1 = 0;
    secret2 = 0;
    secret3 = 0;
  }
  
  /**
   * Sets the first number of the combination
   * @param ticks The number of ticks to turn the first number
   */
  public void turnSecret1(int ticks) 
  {
    int newSecret1 = secret1 + ticks;
    if (newSecret1 >= 0 && newSecret1 <= 39) 
    {
      secret1 = newSecret1;
    }
    else 
    {
      System.out.println("The number must be between 0 and 39");
    }
  }
  
  /**
   * Sets the second number of the combination
   * @param ticks The number of ticks to turn the second number
   */
  public void turnSecret2(int ticks) 
  {
    int newSecret2 = secret2 + ticks;
    if (newSecret2 >= 0 && newSecret2 <= 39) 
    {
      secret2 = newSecret2;
    }
    else 
    {
      System.out.println("The number must be between 0 and 39");
    }
  }
  
  /**
   * Sets the third number of the combination
   * @param ticks The number of ticks to turn the third number
   */
  public void turnSecret3(int ticks) 
  {
    int newSecret3 = secret3 + ticks;
    if (newSecret3 >= 0 && newSecret3 <= 39) 
    {
      secret3 = newSecret3;
    }
    else 
    {
      System.out.println("The number must be between 0 and 39");
    }
  }
  
  //------------Other Methods-----------------
  
  /**
   * Opens the combination lock if the provided input is correct
   * @return Information whether the lock is open or not
   */
  public boolean open() 
  {
    return (secret1 == combination[0] && secret2 == combination[1] && secret3 == combination[2]);
  }
  
  /**
   * Returns a string representation of the contents of the fields of a ComboLock
   * @return The information in the fields of a ComboLock
   */
  public String toString() 
  {
    String contents = "The secret combination is [" + combination[0] + ":" + combination[1] + ":" + combination[2] + "]";
    contents+= "\nThe numbers you chose are: " + getSecret1() + ", " + getSecret2() + ", " + getSecret3();
    return contents;
  }
}