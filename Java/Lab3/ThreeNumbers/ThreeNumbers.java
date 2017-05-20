import java.util.Scanner;

public class ThreeNumbers 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double firstNum = in.nextDouble();
    System.out.println("");
    System.out.print("Enter second number: ");
    double secondNum = in.nextDouble();
    System.out.println("");
    System.out.print("Enter third number: ");
    double thirdNum = in.nextDouble();
    System.out.println("");
    System.out.print("The numbers are ");
    if(firstNum == secondNum && firstNum == thirdNum) 
    {
      System.out.println("all the same");
    }
    else if(firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum) 
    {
      System.out.println("all different");
    }
    else 
    {
      System.out.println(" neither all the same, nor all different");
    }
    in.close();
  }
}