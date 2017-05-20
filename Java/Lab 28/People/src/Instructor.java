/**
 *
 * @author s4et0
 */
public class Instructor extends Person{
    private double salary;

    public Instructor(String name, int year, double salary) {
        super(name, year);
        this.salary = salary;
    }

    public Instructor() {
        super();
        this.salary = 0.0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" + "name=" + name + ", year=" + year + ", salary=" + salary + '}';
    }
    
    
}
