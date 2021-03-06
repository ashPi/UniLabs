/**
 *
 * @author s4et0
 */
public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public Manager() {
        super();
        this.department = "not assigned";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "{department=" + department + '}';
    }
    
}
