public class FuelGauge 
{
  private int litres;
  //-----------------Constructor--------------------
  public FuelGauge() 
  {
    litres = 0;
  }
  
  public FuelGauge(int Litres) 
  {
    litres = Litres;
  }
  //-----------------Accessor Methods--------------------
  public int getLitres() 
  {
    return litres;
  }
  
  //-----------------Setter Method-----------------------
  public void setLitres(int Litres) 
  {
    litres = Litres;
  }
  //-----------------Other Methods-----------------------
  public String toString() 
  {
    String contents = "";
    contents+= getLitres();
    return contents;
  }
  
  public void putFuel() 
  {
    if(getLitres() < 40) 
    {
      setLitres(getLitres() + 1);
    }
    else 
    {
      setLitres(0);
    }
  }
  
  public void useFuel() 
  {
    if(getLitres() > 0) 
    {
      setLitres(getLitres() - 1);
    }
  }
}