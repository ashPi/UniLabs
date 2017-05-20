public class Person 
{
  //--------------------Fields-----------------------------------
  private String firstName;
  private String lastName;
  private int age;
  private Boolean insurance;
  
  //--------------------Constructors-----------------------------------
  
  public Person() 
  {
    firstName = "Not specified";
    lastName = "Not specified";
    age = 0;
    insurance = false;
  }
  
  public Person(String aFirstName, String aLastName, int anAge, Boolean anInsurance) 
  {
    firstName = aFirstName;
    lastName = aLastName;
    age = anAge;
    insurance = anInsurance;
  }
  
  //--------------------Setter Methods-----------------------------------
  public void setFirstName(String aFirstName) 
  {
    firstName = aFirstName;
  }
  
  public void setLastName(String aLastName) 
  {
    lastName = aLastName;
  }
  
  public void setAge(int anAge) 
  {
    age = anAge;
  }
  
  public void setInsurance(Boolean anInsurance) 
  {
    insurance = anInsurance;
  }
  
  //--------------------Getter Methods-----------------------------------
  
  public String getFirstName() 
  {
    return firstName;
  }
  
  public String getLastName() 
  {
    return lastName;
  }
  
  public int getAge() 
  {
    return age;
  }
  
  public Boolean getInsurance() 
  {
    return insurance;
  }
  //--------------------Other Methods-----------------------------------
  
  public String toString() 
  {
    String contents = "First name: " + getFirstName();
    contents+= "\nLast name: " + getLastName();
    contents+= "\nAge: " + getAge();
    contents+= "\nHas insurance: " + getInsurance();
    return contents;
  }
}