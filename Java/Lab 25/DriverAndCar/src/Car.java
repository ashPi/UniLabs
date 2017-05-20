/**
 *
 * @author s4et0
 */
public class Car {
    private String make;
    private double mileage;
    private String registration;
    private String brakes;
    private Driver driver;

    public Car(String make, double mileage, String registration, String brakes, Driver driver) {
        this.make = make;
        this.mileage = mileage;
        this.registration = registration;
        this.brakes = brakes;
        this.driver = new Driver(driver.getPerson(), driver.getAge(), driver.getLicenceStatus(), driver.getPenaltyPoints(), driver.getInsuranceStatus());
    }
    
    public Car() {
        this.make = "not assigned";
        this.mileage = 0;
        this.registration = "not assigned";
        this.brakes = "not assigned";
        this.driver = new Driver();
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = new Driver(driver.getPerson(), driver.getAge(), driver.getLicenceStatus(), driver.getPenaltyPoints(), driver.getInsuranceStatus());
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + getMake() + ", mileage=" + getMileage() + ", registration=" + getRegistration() + ", brakes=" + getBrakes() + ", driver=" + getDriver().info() + " , is roadworthy=" + isRoadworthy() + '}';
    }
    
    public boolean isRoadworthy() {
        boolean roadworthy = false;
        if(getBrakes().equals("good") && getDriver().isLegal()) {
            roadworthy = true;
        }
        return roadworthy;
    }
}
