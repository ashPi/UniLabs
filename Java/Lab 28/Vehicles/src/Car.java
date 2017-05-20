/**
 *
 * @author 1600502
 */
public class Car extends Vehicle{
    private int numberOfSeats;
    private double engineSize;

    public Car(String make, String model, String regstrationNumber, boolean isHired, int numberOfSeats, double engineSize) {
        super(make, model, regstrationNumber, isHired);
        this.numberOfSeats = numberOfSeats;
        this.engineSize = engineSize;
    }

    public Car(int numberOfSeats, double engineSize) {
        super();
        this.numberOfSeats = numberOfSeats;
        this.engineSize = engineSize;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        //return "Car{" + "numberOfSeats=" + numberOfSeats + ", engineSize=" + engineSize + '}';
        return "Car{" + "make=" + getMake() + ", model=" + getModel() + ", regstrationNumber=" + getRegistrationNumber() + ", isHired=" + isHired() + "numberOfSeats=" + numberOfSeats + ", engineSize=" + engineSize + '}';
    }
}
