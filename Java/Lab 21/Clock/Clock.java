public class Clock
{
  private NumberDisplay hours;
  private NumberDisplay minutes;
  private String pm;
  
  //-----------------------Constructor-------------------------------------
  public Clock() 
  {
    hours = new NumberDisplay(24);
    hours.setValue(12);
    minutes = new NumberDisplay(60);
    pm = "";
  }
  
  public Clock(int hoursValue, int minValue) 
  {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    setTime(hoursValue,minValue);
  }
  
  //-----------------------Getter Method-------------------------------------
  public String getTime() 
  {
    String time = "";
    if(hours.getValue() == 0) 
    {
      time+= "12";
    }
    else if(hours.getValue() > 12) 
    {
      time+= hours.getValue() - 12;
    }
    else 
    {
      time+= hours.getValue();
    }
    time+= ":" + minutes.toString() + pm;
    return time;
  }
  
  //-----------------------Setter Methods-------------------------------------
  public void setTime(int hour, int minute) 
  {
    hours.setValue(hour);
    minutes.setValue(minute);
    if(hour > 12) 
    {
      pm = "pm";
    }
    else 
    {
      pm = "";
    }
  }
  
  //-----------------------Other Methods-------------------------------------
  
  public void Tick() 
  {
    minutes.incrementValue();
    if(minutes.getValue() == 0) 
    {
      hours.incrementValue();
      if(hours.getValue() > 11) 
      {
        pm = "pm";
      }
      else 
      {
        pm = "";
      }
    }
  }
}