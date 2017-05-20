import java.util.Scanner;

public class RollingDice 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number of rolls: ");
    int rollsNum;
    int firstDie, secondDie;
    int firstGreaterCounter = 0;
    int total = 0;
    for(rollsNum = in.nextInt(); rollsNum > 0; rollsNum--) 
    {
      System.out.println("");
      firstDie = (int) (Math.random()*6) +1;
      System.out.println("First die is " + firstDie);
      secondDie = (int) (Math.random()*6) +1;
      System.out.println("Second die is " + secondDie);
      System.out.println("The total is " + (firstDie + secondDie));
      if(firstDie > secondDie) firstGreaterCounter++;
      total+= firstDie + secondDie;
      System.out.println("");
    }
    System.out.println("The first die was greater than the second " + firstGreaterCounter + " times");
    System.out.println("THe total of all dice rolls is " + total);
    in.close();
  }
}