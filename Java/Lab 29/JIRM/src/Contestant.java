/**
 *
 * @author s4et0
 */
public class Contestant {
    private String name;
    private double weight;

    public Contestant(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public Contestant() {
        this.name = "not assigned";
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Contestant{" + "name=" + name + ", weight=" + weight + '}';
    }
}
