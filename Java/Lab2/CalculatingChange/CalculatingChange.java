import java.util.Scanner;

public class CalculatingChange 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Amount of change expected: ");
    double change = in.nextDouble();
    final int P_IN_A_POUND = 100;
    int pounds = (int)(change / 1);
    int temp = (int) ((change - pounds) * P_IN_A_POUND);
    int p50 = temp / 50;
    temp-= p50 * 50;
    int p20 = temp / 20;
    temp-= p20 * 20;
    int p10 = temp / 10;
    temp-= p10 * 10;
    int p5 = temp / 5;
    temp-= p5 * 5;
    int p2 = temp / 2;
    temp-= p2 * 2;
    int p1 = temp;
    System.out.println("Your change consists of " + pounds + " x ?1, " + p50 + " x 50p, " + p20 + " x 20p, " + 
                       p10 + " x 10p, " + p5 + " x 5p, " + p2 + " x 2p and " + p1 + " x 1p");
    in.close();
  }
}