import java.util.Scanner;

public class RaceTheComputer 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int firstDieComputer, secondDieComputer, firstDiePlayer, secondDiePlayer;
    do 
    {
      System.out.println("");
      int totalComputer = 0, totalPlayer = 0;
      do  
      {
        firstDiePlayer = (int) (Math.random()*6) +1;
        secondDiePlayer = (int) (Math.random()*6) +1;
        firstDieComputer = (int) (Math.random()*6) +1;
        secondDieComputer = (int) (Math.random()*6) +1;
        totalComputer+= firstDieComputer + secondDieComputer;
        totalPlayer+= firstDiePlayer + secondDiePlayer;
        System.out.println("Computer`s pair is " + firstDieComputer + " and " + secondDieComputer + ". Computer`s total so far is " + totalComputer);
        System.out.println("Your pair is " + firstDiePlayer + " and " + secondDiePlayer + ". Your total so far is " + totalPlayer);
      }
      while(totalComputer < 30 && totalPlayer < 30);
      if(totalComputer >= 30) 
      {
        System.out.println("Sorry, the computer wins");
      }
      else 
      {
        System.out.println("Congratulations, you win!");
      }
      System.out.print("Would you like to play another game? (y/n): ");
    }
    while(in.next().charAt(0) == 'y');
    in.close();
  }
}