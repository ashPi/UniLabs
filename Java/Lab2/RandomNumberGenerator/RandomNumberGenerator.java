import java.util.Scanner;

public class RandomNumberGenerator 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    //a);
    System.out.println("Generating a random number between 0 and 1 (excl. 1): " + Math.random());
    //b);
    System.out.print("Enter q: ");
    double q = in.nextDouble();
    System.out.println("");
    System.out.println("Generating a random number between 0 and q (excl. q): " + Math.random()*q);
    //c);
    System.out.print("Enter q: ");
    q = in.nextDouble();
    System.out.println("");
    System.out.println("Generating a random whole number between 0 and q (incl. q): " + ((int)(Math.random()*(q + 1))));
    //d);
    System.out.print("Enter p: ");
    double p = in.nextDouble();
    System.out.println("");
    System.out.print("Enter q: ");
    q = in.nextDouble();
    System.out.println("");
    System.out.println("Generating a random whole number between p and q (incl. both): " + ((int)(Math.random()*(q - p +1) + p)));
    in.close();
  }
}