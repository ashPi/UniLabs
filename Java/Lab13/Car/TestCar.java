/**
 * A Test Class for Car class
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class TestCar 
{
  public static void main(String[] args) 
  {
    //Create an instance of UsedCar
    //with owner Tacheva
    //make Rolls Royce
    //mileage 25 000
    //isPetrol false
    Car car = new Car("Tacheva", "Rolls Royce", 25000, false);
    
    //Test getters
    System.out.println("Surname: " + car.getOwner());
    System.out.println("Make: " + car.getMake());
    System.out.println("Mileage: " + car.getMileage());
    System.out.println("Petrol: " + car.getIsPetrol());
    
    //Test the replacement() method
    System.out.println("Replacement needed: " + car.replacement());
    
    //Test the mileageClassification() method
    System.out.println("Mileage class: " + car.mileageClassification());
    
    //Testing mileageClassification() and replacement() methods
    car.setMileage(100001);
    System.out.println("\nUpdated mileage: " + car.getMileage());
    System.out.println("Replacement needed: " + car.replacement());
    System.out.println("Mileage class: " + car.mileageClassification());
    System.out.println("");
    System.out.println("");
    //Test setters
    car.setOwner("Yakimova");
    car.setMake("Fiat");
    car.setMileage(75001);
    car.setIsPetrol(true);
    
    //Test toString() method
    System.out.println("\n" + car.toString());
    
  } // End of main() method
} //End of Test Class