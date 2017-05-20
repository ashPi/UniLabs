import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestUniversity {
    public static void main(String[] args) {
        Student sis = new Student();
        sis.setFirstName("Silviya");
        sis.setSecondName("Tacheva");
        sis.setSchool("Scool of Computing");
        sis.setCourse("Computer Science");
        sis.setMatricNumber("1600502");
        //System.out.println(sis.toString());
        
        Staff roger = new Staff("Roger", "McDermott", "Scool of Computing", "Lecturer");
        //System.out.println(roger.toString());
        
        Staff bill = new Staff("Bill", "Pink", "Gray`s School of Art", "Janitor");
        //System.out.println(bill.toString());
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(sis);
        people.add(roger);
        people.add(bill);
        //System.out.println(people.toString());
        
        University uni = new University(people);
        //System.out.println(uni.toString());
        
        uni.listOf("Computer Science");
        uni.listOf("Janitor");
        uni.listOf("Lecturer");
    }
}
