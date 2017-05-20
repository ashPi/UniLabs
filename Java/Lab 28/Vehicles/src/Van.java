/**
 *
 * @author 1600502
 */
public class Van extends Vehicle{
    private double capacity;

    public Van(String make, String model, String regstrationNumber, boolean isHired, double capacity) {
        super(make, model, regstrationNumber, isHired);
        this.capacity = capacity;
    }

    public Van(double capacity) {
        super();
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String contents = super.toString();
        contents+= "Van{" + "capacity=" + capacity + '}';
        return contents;
        //return "Van{" + "make=" + make + ", model=" + model + ", regstrationNumber=" + regstrationNumber + ", isHired=" + isHired + ", capacity=" + capacity + '}';
    }
    
    
    
}
