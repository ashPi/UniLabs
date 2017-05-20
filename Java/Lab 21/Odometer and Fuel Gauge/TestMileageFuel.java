public class TestMileageFuel 
{
  public static void main(String args[]) 
  {
    /*DistanceMeter myCar = new DistanceMeter();
    System.out.println(myCar.toString());
    System.out.println();
    //----------------------------------------------*/
    DistanceMeter myCar = new DistanceMeter(77777, 38);
    /*System.out.println(myCar.toString());
    System.out.println();
    //----------------------------------------------*/
    FuelGauge reservoir = new FuelGauge();
    //System.out.println(reservoir.toString());
    //System.out.println();
    //----------------------------------------------
    for(int i = 0; i < 40; i++) 
    {
      reservoir.putFuel();
    }
    //System.out.println(reservoir.toString());
    //System.out.println();
    //----------------------------------------------
    myCar.setFuel(reservoir.getLitres());
    System.out.println(myCar.toString());
    System.out.println();
    int miles = 1;
    while(myCar.getFuel() > 0) 
    {
      myCar.incrementMileage();
      if(miles % 20 == 0) 
      {
        System.out.println("Current mileage: " + myCar.getMileage());
        System.out.println("Current fuel: " + myCar.getFuel());
      }
      miles++;
    }
  }
}