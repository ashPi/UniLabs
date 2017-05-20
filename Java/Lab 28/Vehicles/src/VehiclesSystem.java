import java.util.*;
/**
 *
 * @author 1600502
 */
public class VehiclesSystem {
    private ArrayList<Vehicle> vehicles;

    public VehiclesSystem(ArrayList<Vehicle> vehicles) {
        this.vehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            this.vehicles.add(vehicle);
        }
    }
    
    public VehiclesSystem() {
        this.vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        String contents = "Vehicles:\n";
        for (Vehicle vehicle : vehicles) {
            contents+= vehicle.toString() + "\n";
        }
        return contents;
    }
    
    public String hiredList() {
        String contents = "Hired out vehicles:\n";
        for (Vehicle vehicle : vehicles) {
            if(vehicle.isHired()) {
                contents+= vehicle.toString() + "\n";
            }
        }
        return contents;
    }
}
