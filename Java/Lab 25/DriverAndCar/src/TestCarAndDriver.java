/**
 *
 * @author s4et0
 */
public class TestCarAndDriver {
    public static void main(String[] args) {
        Driver jimmy = new Driver();
        System.out.println(jimmy.info());
        System.out.println("Is Jimmy legal: " + jimmy.isLegal());
        Car jCar = new Car();
        System.out.println(jCar.toString());
        
        jimmy = new Driver("Jimmy Kowalski", 35, "full", 20, "none");
        System.out.println(jimmy.toString());
        
        Driver frank = new Driver();
        Car fCar = new Car();
        fCar.setBrakes("good");
        fCar.setDriver(frank);
        fCar.setMake("Zada");
        fCar.setMileage(5000);
        fCar.setRegistration("EN1997SMSV");
        fCar.getDriver().setAge(40);
        fCar.getDriver().setPerson("Frank Bullitt");
        fCar.getDriver().setInsuranceStatus("fully comprehensive");
        fCar.getDriver().setPenaltyPoints(3);
        fCar.getDriver().setLicenceStatus("provisional");
        System.out.println(fCar.getDriver().toString());
        System.out.println(fCar.toString());
        fCar.setBrakes("worn");
        System.out.println("Is Frank`s car roadworthy: " + fCar.isRoadworthy());
    }
}
