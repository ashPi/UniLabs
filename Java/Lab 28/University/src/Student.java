/**
 *
 * @author s4et0
 */
public class Student extends Person{
    private String matricNumber;
    private String course;

    public Student(String firstName, String secondName, String school, String matricNumber, String course) {
        super(firstName, secondName, school);
        this.matricNumber = matricNumber;
        this.course = course;
    }

    public Student() {
        super();
        this.matricNumber = "not assigned";
        this.course = "not assigned";
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + "matricNumber=" + matricNumber + "\ncourse=" + course + '\n';
    }
    
    
}
