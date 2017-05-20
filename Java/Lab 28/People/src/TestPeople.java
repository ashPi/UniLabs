import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestPeople {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Sis";
        person.year = 1997;
        System.out.println("Person: " + person.toString());
        
        Student sis = new Student("Silviya Tacheva", 1991, "Computing");
        System.out.println("Student: " + sis.toString());
        person = sis;
        System.out.println("Person to sis: " + person.toString());
        
        Instructor colin = new Instructor();
        colin.name = "Colin Williams";
        colin.year = 1977;
        colin.setSalary(2470.50);
        System.out.println("Instructor: " + colin.toString());
        
        person = colin;
        System.out.println("Person to Colin: " + person.toString());
        
        colin = (Instructor)person;
        System.out.println("PErson casted to instructor: " + colin.toString());
    }
    
}
