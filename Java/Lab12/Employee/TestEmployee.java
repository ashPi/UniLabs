/**
 * A Test Class for the Employee class
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class TestEmployee 
{
  public static void main(String[] args) 
  {
    //Create an instance of Employee
    //with name Silviya Tacheva
    //idNumber 1600502
    //department Computing School
    //position student
    Employee emp = new Employee("Silviya Tacheva", 1600502, "Computing School", "Student");
    
    // Test the getter methods
    //Should print Silviya Tacheva
    System.out.println("Name: " + emp.getName());
    //Should print 1600502
    System.out.println("ID number: " + emp.getidNumber());
    //Should print Computing School
    System.out.println("Department: " + emp.getDepartment());
    //Should print Student
    System.out.println("Position: " + emp.getPosition());
    
    //Test the setters and the toString() method
    emp.setName("Vicky Yakimova");
    emp.setidNumber(13041997);
    emp.setDepartment("Neuroscience");
    emp.setPosition("Student");
    //Should print:
    //Name of the employee is Vicky Yakimova
    //ID number of the employee is 13041997
    //Name of the department where the employee works is Neuroscience
    //Employee`s job title is Student
    System.out.println(emp.toString());
    
  } // End of the main() method
} // End of the Test Class