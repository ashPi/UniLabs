public class Employee 
{
  private String firstName;
  private String lastName;
  
  //------------------------------Constructors------------------------------
  
  public Employee() 
  {
    firstName = "Not assigned";
    lastName = "Not assigned";
  }
  
  public Employee(String first, String last) 
  {
    firstName = first;
    lastName = last;
  }
  
  //------------------------------Getters------------------------------
  
  public String getFirstName() 
  {
    return firstName;
  }
  
  public String getLastName() 
  {
    return lastName;
  }
  
  //------------------------------Setters------------------------------
  
  public void setFirstName(String first) 
  {
    firstName = first;
  }
  
  public void setLastName(String last) 
  {
    lastName = last;
  }
  
  //------------------------------Other Methods------------------------------
  
  public String toString() 
  {
    String contents = "First name: " + getFirstName();
    contents+= "\nLast name: " + getLastName();
    return contents;
  }
}