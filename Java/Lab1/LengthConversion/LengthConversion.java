public class LengthConversion 
{
  public static void main (String[] args) 
  {
    final int CM_IN_M = 100;
    final int INCHES_IN_FOOT = 12;
    final double CM_IN_INCH = 0.39;
    double metres = 3.4;
    int inches = 0;
    int feet = 0;
    double cm = metres * CM_IN_M;
    inches = (int)(cm * CM_IN_INCH);
    feet = (int)(inches / INCHES_IN_FOOT);
    inches = (int)(inches % INCHES_IN_FOOT); 
    System.out.println(metres + "m = " + feet + "ft " + inches + "inches");
  }
}