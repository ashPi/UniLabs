import java.util.*;
/**
 *
 * @author s4et0
 */
public class University {
    private ArrayList<Student> students;
    private ArrayList<Staff> staff;

    public University(ArrayList<Person> people) {
        this.students = new ArrayList<>();
        this.staff = new ArrayList<>();
        
        for (Object object : people) {
            if(object instanceof Student) {
                students.add((Student)object);
            }
            else {
                staff.add((Staff)object);
            }
        }
    }
    
    public University() {
        this.students = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        String contents = "Students:\n";
        for (Student student : students) {
            contents+= student.toString();
        }
        contents+= "\nStaff:\n";
        for (Staff member : staff) {
            contents+= member.toString();
        }
        return contents;
    }
    
    public void listOf(String occupation) {
        System.out.println(occupation + "s:");
        for (Student student : students) {
            if(student.getCourse().equals(occupation)) {
                System.out.println(student.getFirstName() + " " + student.getSecondName());
            }
        }
        for (Staff member : staff) {
            if(member.getJobTitle().equals(occupation)) {
                System.out.println(member.getFirstName() + " " + member.getSecondName());
            }
        }
    }
}
