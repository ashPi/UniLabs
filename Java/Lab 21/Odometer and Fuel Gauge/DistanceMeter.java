public class DistanceMeter 
{
  private int mileage;
  private final int startMileage;
  private FuelGauge fuel;
  //----------------------Constructor-------------------------
  public DistanceMeter() 
  {
    mileage = 0;
    startMileage = 0;
    fuel = new FuelGauge();
  }
  
  public DistanceMeter(int aMileage, int litres) 
  {
    mileage = aMileage;
    startMileage = aMileage;
    fuel = new FuelGauge(litres);
  }
  
  //----------------------Accessor Method-------------------------
  public int getMileage() 
  {
    return mileage;
  }
  
  public int getStartMileage() 
  {
    return startMileage;
  }
  
  public int getFuel() 
  {
    return fuel.getLitres();
  }
  
  //----------------------Setter Method---------------------------
  public void setMileage(int aMileage) 
  {
    mileage = aMileage;
  }
  
  public void setFuel(int litres) 
  {
    fuel.setLitres(litres);
  }
  
  //----------------------Other Methods---------------------------
  public String toString() 
  {
    String contents = "Mileage: " + getMileage();
    contents+= "\nFuel: " + getFuel();
    return contents;
  }
  
  public void incrementMileage() 
  {
    setMileage((getMileage() + 1) % 999999);
    if((getMileage() - getStartMileage()) % 10 == 0) 
    {
      fuel.useFuel();
    }
  }
}