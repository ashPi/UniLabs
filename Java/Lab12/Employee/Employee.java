/**
 * This class represents an emplyee
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class Employee 
{
  /**
   * A String that holds the emplyee`s name
   */
  private String name;
  
  /**
   * An int that holds the emplyee`s id number
   */
  private int idNumber;
  
  /**
   * A String that holds the name of the department
   * where the emplyee works
   */
  private String department;
  
  /**
   * A String that holds the emplyee`s job title
   */
  private String position;
  
  /**
   * Constructor for the Emplyee object
   * @param aName The name of the emplyee
   * @param anIDNum The emplyee`s ID number
   * @param aDepartment The name of the department where the employee works
   * @param aPosition The employee`s job title
   */
  public Employee(String aName, int anIDNum, String aDepartment, String aPosition) 
  {
    name = aName;
    idNumber = anIDNum;
    department = aDepartment;
    position = aPosition;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the name of the employee
   * @return The name of the employee
   */
  public String getName() 
  {
    return name;
  }
  
  /**
   * Gets the id number of the emplyee
   * @return The employee`s id number
   */
  public int getidNumber() 
  {
    return idNumber;
  }
  
  /**
   * Gets the name of the department where the employee works
   * @return The name of the department where the emplyee works
   */
  public String getDepartment() 
  {
    return department;
  }
  
  /**
   * Gets the emplyee`s job title
   * @return The emplyee`s job title
   */
  public String getPosition() 
  {
    return position;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Sets the name of the employee
   * @param aName The name of the employee
   */
  public void setName(String aName) 
  {
    name = aName;
  }
  
  /**
   * Sets the employee`s ID number
   * @param anIDNum The employee`s ID number
   */
  public void setidNumber(int anIDNum) 
  {
    idNumber = anIDNum;
  }
  
  /**
   * Sets the department where the employee works
   * @param aDepartment The name of the department
   */
  public void setDepartment(String aDepartment) 
  {
    department = aDepartment;
  }
  
  /**
   * Sets the employee`s job title
   * @param aPosition The employee`s job title
   */
  public void setPosition(String aPosition) 
  {
    position = aPosition;
  }
  
  //------------Other Methods-----------------
  
  /**
   * Returns a string representation of the contents of the fields of an Employee
   * @return The information in the fields of an Employee
   */
  public String toString() 
  {
    String contents = "Name of the employee is " + getName();
    contents+= "\nId number of the employee is " + getidNumber();
    contents+= "\nName of the department where the employee works is " + getDepartment();
    contents+= "\nEmployee`s job title is " + getPosition();
    return contents;
    
  }
}