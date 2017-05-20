/**
 *
 * @author s4et0
 */
public class Rabbit extends Contestant{
    private String breed;
    private String colour;

    public Rabbit(String name, double weight, String breed, String colour) {
        super(name, weight);
        this.breed = breed;
        this.colour = colour;
    }

    public Rabbit() {
        super();
        this.breed = "not assigned";
        this.colour = "not assigned";
    }   

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + "Rabbit{" + "breed=" + breed + ", colour=" + colour + '}';
    }
}
