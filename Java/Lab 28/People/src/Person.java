/**
 *
 * @author s4et0
 */
public class Person {
    protected String name;
    protected int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    public Person() {
        this.name = "not assigned";
        this.year = 0;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", year=" + year + '}';
    }
}
