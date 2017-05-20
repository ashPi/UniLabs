import java.util.Scanner;

public class ZeroPositiveNegative 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    System.out.println("");
    double userNumber;
    if(in.hasNextDouble()) 
    {
      userNumber = in.nextDouble();
    }
    else 
    {
      System.out.println("Please, enter a valid number");
      userNumber = in.nextDouble();
    }
    System.out.print("The number is ");
    if(userNumber == 0) 
    {
      System.out.println("zero.");
    }
    else 
    {
      System.out.print((userNumber > 0 ? "positive " : "negative "));
      if(Math.abs(userNumber) < 1) 
      {
        System.out.print("and small");
      }
      if(Math.abs(userNumber) > 1000000) 
      {
        System.out.print("and large");
      }
    }
    System.out.println("");
    in.close();
  }
}