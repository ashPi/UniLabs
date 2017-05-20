/**
 *
 * @author s4et0
 */
public class Staff extends Person{
    private String jobTitle;

    public Staff(String firstName, String secondName, String school, String jobTitle) {
        super(firstName, secondName, school);
        this.jobTitle = jobTitle;
    }

    public Staff() {
        super();
        this.jobTitle = "not assigned";
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "jobTitle=" + jobTitle + '\n';
    }
    
    
}
