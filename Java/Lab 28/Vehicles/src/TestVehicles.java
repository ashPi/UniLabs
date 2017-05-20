import java.util.*;
/**
 *
 * @author 1600502
 */
public class TestVehicles {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Z100", "15646", false, 4, 5000.2);
        System.out.println(myCar.toString());
        
        Van myVan = new Van("Honda", "Y", "1600502", true, 9005.1);
        System.out.println(myVan.toString());
        
        Vehicle veh = new Vehicle();
        System.out.println(veh.toString());
        veh = myCar;
        System.out.println(veh.toString());
        /*ArrayList<Vehicle> arr = new ArrayList<>();
        arr.add(myCar);
        arr.add(myVan);
        VehiclesSystem sys = new VehiclesSystem(arr);
        System.out.println(sys.toString());
        System.out.println(sys.hiredList());*/
    }
    
}
