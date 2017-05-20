/**
 *
 * @author s4et0
 */
public class Contestant {
    private String name;
    private int age;
    private double weight;
    private String owner;

    public Contestant(String name, int age, double weight, String owner) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }
    
    public Contestant() {
        this.name = "not assigned";
        this.age = 0;
        this.weight = 0;
        this.owner = "not assigned";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Contestant:\n" + "name: " + name + "\nage: " + age + "\nweight: " + weight + "\nowner: " + owner;
    }
}
