public class Test12Clock 
{
  public static void main(String args[]) 
  {
    Clock12 myClock = new Clock12();
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
    myClock = new Clock12(11,59, "pm");
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