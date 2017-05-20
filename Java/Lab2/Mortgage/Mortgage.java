import java.util.Scanner;

public class Mortgage 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Amount of a mortgage: ");
    System.out.println("");
    double mortgageAmount = in.nextDouble();
    System.out.print("Interest rate: ");
    System.out.println("");
    double interest = in.nextDouble();
    System.out.print("Number of years: ");
    System.out.println("");
    double years = in.nextDouble();
    final int MONTHS_IN_YEAR = 12;
    int months = (int) (years * MONTHS_IN_YEAR);
    double monthlyRepayment = (mortgageAmount * Math.pow((1 + interest), months) * interest) / (Math.pow((1 + interest), months) - 1);
    System.out.printf("The monthly repayment is %.2f \n", monthlyRepayment);
    in.close();
  }
}