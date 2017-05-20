public class Test 
{
  public static void main(String args[]) 
  {
    Person myGuy = new Person("Ivan", "Ivanov", 50, true);
    Car myCar = new Car(myGuy, "Honda", 5000, true);
    System.out.println(myCar.toString());
    System.out.println();
    System.out.println();
    //-------------------------------------------------------
    
    myGuy = new Person();
    myCar.setOwner(myGuy);
    System.out.println(myCar.toString());
    System.out.println();
    System.out.println();
    //-------------------------------------------------------
    
    myCar.setMileage(1000001);
    myCar.displayWarning();
    System.out.println();
    System.out.println();
    //-------------------------------------------------------
    
    System.out.println("Replacement needed: " + myCar.replacementNeeded());
    myCar.setPetrol(false);
    System.out.println("Replacement needed: " + myCar.replacementNeeded());
  }
}