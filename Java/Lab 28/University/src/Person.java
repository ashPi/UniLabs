/**
 *
 * @author s4et0
 */
public class Person {
     private String firstName;
     private String secondName;
     private String school;

    public Person(String firstName, String secondName, String school) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.school = school;
    }
     
    public Person() {
        this.firstName = "not assigned";
        this.secondName = "not assigned";
        this.school = "not assigned";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return getClass().getName() + ":\nfirstName=" + firstName + "\nsecondName=" + secondName + "\nschool=" + school + '\n';
    }
    
    
}
