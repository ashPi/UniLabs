public class Test24Clock 
{
  public static void main(String args[]) 
  {
    Clock24 myClock = new Clock24();
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    myClock.setTime(23,59);
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
    myClock = new Clock24(12,59);
    System.out.println(myClock.getTime());
    System.out.println();
    //--------------------------------------------
    /*NumberDisplay min = new NumberDisplay(60);
    min.setValue(58);
    min.incrementValue();
    System.out.println(min.toString());*/
  }
}