/**
 *
 * @author 1600502
 */
public class Vehicle {
    private String make;
    private String model;
    private String registrationNumber;
    private boolean isHired;

    public Vehicle(String make, String model, String regstrationNumber, boolean isHired) {
        this.make = make;
        this.model = model;
        this.registrationNumber = regstrationNumber;
        this.isHired = isHired;
    }
    
    public Vehicle() {
        this.make = "not aasigned";
        this.model = "not assigned";
        this.registrationNumber = "not assigned";
        this.isHired = false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String regstrationNumber) {
        this.registrationNumber = regstrationNumber;
    }

    public void setIsHired(boolean isHired) {
        this.isHired = isHired;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + getMake() + ", model=" + getModel() + ", registrationNumber=" + getRegistrationNumber() + ", isHired=" + isHired() + '}';
    }

    /**
     * @return the isHired
     */
    public boolean isHired() {
        return isHired;
    }
}
