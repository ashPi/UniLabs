/**
 *
 * @author s4et0
 */
public class Student extends Person{
    private String major;

    public Student(String name, int year, String major) {
        super(name, year);
        this.major = major;
    }

    public Student() {
        super();
        this.major = "not assigned";
    }    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", year=" + year + ", major=" + major + '}';
    }
    
}
