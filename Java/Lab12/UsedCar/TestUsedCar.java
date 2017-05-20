/**
 * A Test Class for UsedCar class
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class TestUsedCar 
{
  public static void main(String[] args) 
  {
    //Create an instance of UsedCar
    //with make Ford
    //model Ranger
    //colour Silver
    //licence number EN 2519 LA
    //mileage 17 000
    //fuel type diesel
    UsedCar car = new UsedCar("Ford", "Ranger", "Silver", "EN2519LA", 17000, "diesel");
    
    //Test getters
    System.out.println("Make: " + car.getMake());
    System.out.println("Model: " + car.getModel());
    System.out.println("Licence number: " + car.getLicenceNumber());
    System.out.println("Colour: " + car.getColour());
    System.out.println("Mileage: " + car.getMileage());
    System.out.println("Fuel type: " + car.getFuelType());
    
    //Test setters
    car.setMake("Fiat");
    car.setModel("Mobi");
    car.setColour("Blue");
    car.setLicenceNumber("PL1997ST");
    car.setMileage(7000);
    car.setFuelType("petrol");
    
    //Test toString() method
    System.out.println("\n" + car.toString());
  }
}