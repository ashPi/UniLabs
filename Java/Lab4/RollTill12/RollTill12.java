import java.util.Scanner;

public class RollTill12 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int firstDie, secondDie;
    int rollsCount = 0;
    do 
    {
      firstDie = (int) (Math.random()*6) +1;
      System.out.println("First die is " + firstDie);
      secondDie = (int) (Math.random()*6) +1;
      System.out.println("Second die is " + secondDie);
      System.out.println("The total is " + (firstDie + secondDie));
      System.out.println("");
      rollsCount++;
    }
    while(firstDie + secondDie != 12);
    System.out.println("It took " + rollsCount + " times to get a pair of 6");
    in.close();
  }
}