public class TestClock 
{
  public static void main(String args[]) 
  {
    Clock myClock = new Clock();
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock.setTime(11,59);
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock.Tick();
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock.Tick();
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock = new Clock(23,59);
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock.Tick();
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    /*NumberDisplay min = new NumberDisplay(60);
    min.setValue(58);
    min.incrementValue();
    System.out.println(min.toString());*/
  }
}