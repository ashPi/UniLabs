/**
 * A model of a bug which can move along
 * a horizontal line to the right or to the left
 * @author SIlviya Tacheva
 * 2version 1.0 17/02/2017
 */
public class Bug 
{
  
  /**
   * The position of the bug
   */
  private int position;
  
  /**
   * The bug
   */
  private final String bug = "^^0.0^^";
  
  /**
   * The direction of movement
   */
  private String direction;
  
  /**
   * Constructor for a Bug object
   * @param initialPosition The initial position of the bug
   */
  public Bug(int initialPosition) 
  {
    position = initialPosition;
    direction = "right";
  }
  
  //------------------Getter Methods-------------------------
  
  /**
   * Gets the position of the bug
   * @return The position of the bug
   */
  public int getPosition() 
  {
    return position;
  }
  
  /**
   * Gets the direction of movement of the bug
   * @return The direction of movement
   */
  public String getDirection() 
  {
    return direction;
  }
  
  //------------------Other Methods-------------------------
  
  /**
   * Moves the bug
   * @param steps How many steps to make
   */
  public void move(int steps) 
  {
    if(direction == "right") 
    {
      if(position + steps < 100)
      {
        position+= steps;
      }
      else 
      {
        System.out.println("You are getting out of the field!");
      }
    }
    if(direction == "left")
    {
      if(position - steps < 0) 
      {
        System.out.println("You are getting out of the field!");
      }
      else 
      {
        position-= steps;
      }
    }
  }
  
  /**
   * Changes the direction of movement of the bug
   */
  public void turn() 
  {
    if(direction == "left") 
    {
      direction = "right";
    }
    else 
    {
      direction = "left";
    }
  }
  
  /**
   * Shows the field and the bug
   * @return The field and the bug
   */
  public String field() 
  {
    String field = "|";
    for(int i = 0; i < position; i++) 
    {
      field+="-";
    }
    field+= bug;
    for(int i = 0; i < 100 - position; i++) 
    {
      field+="-";
    }
    field+="|";
    return field;
  }
  
  /**
   * A string representation of the contents of the fields of a bug
   * @return The information in the fields of a bug
   */
  public String toString() 
  {
    String contents = "Position: " + getPosition();
    contents+= "\nDirection: " + getDirection();
    return contents;
  }
}
