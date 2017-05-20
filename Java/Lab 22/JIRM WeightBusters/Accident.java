public class Accident
{
  private final int accidentNumber;
  private Employee person;
  private String description;
  private String outcome;
  
  //------------------------------Constructors------------------------------
  
  public Accident() 
  {
    accidentNumber = 0;
    person = new Employee();
    description = "Not assigned";
    outcome = "Not assigned";
  }
  
  public Accident(int number, Employee employee, String aDescription, String anOutcome) 
  {
    accidentNumber = number;
    person = new Employee(employee.getFirstName(), employee.getLastName());
    description = aDescription;
    if(anOutcome != "First Aid" && anOutcome != "Visit Casually" && anOutcome != "Hospital Admission") 
    {
      outcome = "Not assigned";
    }
    else 
    {
      outcome = anOutcome;
    }
  }
  
  //------------------------------Getters------------------------------
  
  public int getAccidentNumber() 
  {
    return accidentNumber;
  }
  
  public Employee getPerson() 
  {
    return person;
  }
  
  public String getDescription() 
  {
    return description;
  }
  
  public String getOutcome() 
  {
    return outcome;
  }
  
  //------------------------------Setters------------------------------
  
  public void setPerson(Employee employee) 
  {
    person.setFirstName(employee.getFirstName());
    person.setLastName(employee.getLastName());
  }
  
  public void setDescription(String aDescription) 
  {
    description = aDescription;
  }
  
  public boolean setOutcome(String anOutcome) 
  {
    boolean assigned = false;
    if(anOutcome != "First Aid" && anOutcome != "Visit Casually" && anOutcome != "Hospital Admission") 
    {
      outcome = "Not assigned";
    }
    else 
    {
      outcome = anOutcome;
      assigned = true;
    }
    return assigned;
  }
  
  //------------------------------Other Methods------------------------------
  
  public String toString() 
  {
    String contents = "Accident number: " + getAccidentNumber();
    contents+= "\n" + getPerson().toString();
    contents+= "\nDescription: " + getDescription();
    contents+= "\nOutcome: " + getOutcome();
    contents+= "\nThe accident is " + (isSerious() ? "serious" : "minor");
    return contents;
  }
  
  public boolean isSerious() 
  {
    boolean serious = false;
    if(getOutcome() == "Visit Casually" || getOutcome() == "Hospital Admission") 
    {
      serious = true;
    }
    return serious;
  }
}