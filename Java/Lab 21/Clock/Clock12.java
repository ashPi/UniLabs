public class Clock12
{
  private NumberDisplay hours;
  private NumberDisplay minutes;
  private String pm;
  
  //-----------------------Constructor-------------------------------------
  public Clock12() 
  {
    hours = new NumberDisplay(13);
    hours.setValue(12);
    minutes = new NumberDisplay(60);
    pm = "";
  }
  
  public Clock12(int hoursValue, int minValue, String isPm) 
  {
    hours = new NumberDisplay(13);
    minutes = new NumberDisplay(60);
    setTime(hoursValue,minValue);
    pm = isPm;
  }
  
  //-----------------------Getter Method-------------------------------------
  public String getTime() 
  {
    String time = hours.toString() + ":" + minutes.toString() + pm;
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
      if(hours.getValue() == 12) 
      {
        if(pm == "") 
        {
          pm = "pm";
        }
        else 
        {
          pm = "";
        }
      }
      if(hours.getValue() == 0) 
      {
        hours.incrementValue();
      }
    }
  }
}