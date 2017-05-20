import java.util.Scanner;

public class InputWithinRange
{
  public static int validation (int lowest, int highest) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number betweeen " + lowest + " and " + highest + ": ");
    int number;
    do 
    {
      number = in.nextInt();
      if(number < lowest || number > highest) 
      {
        System.out.println("The input is not within the range. Enter a new number, please!");
      }
    }
    while(number < lowest || number > highest);
    in.close();
    return number;
  }
  
  public static void main (String[] args) 
  {
    System.out.println(validation(-30, 45));
  }
}