import java.util.Scanner;

public class RandomValueInRange 
{
  public static int randomInRange(int lowest, int highest) 
  {
    if(lowest < highest) 
    {
      return (int) (Math.random()*(highest - lowest + 1)) + lowest;
    }
    else 
    {
      return (int) (Math.random()*(lowest - highest + 1)) + highest;
    }
  }
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the lowest bound of the interval: ");
    int low = in.nextInt();
    System.out.print("\nEnter the highest bound of the interval: ");
    int high = in.nextInt();
    System.out.println("\nGenerating a random number between " + low + " and " + high + "...");
    System.out.println("The number is " + randomInRange(low, high));
    in.close();
  }
}