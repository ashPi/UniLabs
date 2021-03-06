import java.util.Scanner;

public class LeapYear
{
  public static boolean isLeapYear(int year)
  {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
    {
      return true;
    }
    else 
    {
      return false;
    }
  }
  
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a year to check: ");
    int year = in.nextInt();
    System.out.println("");
    if (isLeapYear(year)) 
    {
      System.out.println("The year is leap");
    }
    else 
    {
      System.out.println("The year is not leap");
    }
    in.close();
  }
}