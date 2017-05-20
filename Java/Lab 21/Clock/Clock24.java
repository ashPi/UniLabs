public class Clock24
{
  private NumberDisplay hours;
  private NumberDisplay minutes;
  
  //-----------------------Constructor-------------------------------------
  public Clock24() 
  {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
  }
  
  public Clock24(int hoursValue, int minValue) 
  {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    //hours.setValue(hoursValue);
    //minutes.setValue(minValue);
    setTime(hoursValue,minValue);
  }
  
  //-----------------------Getter Method-------------------------------------
  public String getTime() 
  {
    String time = hours.toString() + ":" + minutes.toString();
    return time;
  }
  
  //-----------------------Setter Methods-------------------------------------
  public void setTime(int hour, int minute) 
  {
    hours.setValue(hour);
    minutes.setValue(minute);
  }
  
  //-----------------------Other Methods-------------------------------------
  
  public void Tick() 
  {
    minutes.incrementValue();
    if(minutes.getValue() == 0) 
    {
      hours.incrementValue();
    }
  }
}