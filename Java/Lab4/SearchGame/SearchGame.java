import java.util.Scanner;

public class SearchGame 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int bestScore = 0;
    do 
    {
      System.out.println("");
      int prizeX = (int)(Math.random()* 10) + 1;
      int prizeY = (int)(Math.random()* 10) + 1;
      int playerX = 0;
      int playerY = 0;
      int moves = 0;
      System.out.println(prizeX + " " + prizeY);
      do 
      {
        System.out.println("Your position is (" + playerX + ";" + playerY + ")");
        
        if(Math.abs(playerX - prizeX) == 3 || Math.abs(playerY - prizeY) == 3) 
        {
          System.out.println("\nYou are warm");
        }
        else if(Math.abs(playerX - prizeX) == 2 || Math.abs(playerY - prizeY) == 2) 
        {
          System.out.println("\nYou are hot");
        }
        else if(Math.abs(playerX - prizeX) == 1 || Math.abs(playerY - prizeY) == 1) 
        {
          System.out.println("\nYou are boiling");
        }
        else 
        {
          System.out.println("");
        }
        System.out.print("Enter your next move(a[left]/d[right]/s[down]/w[up]): ");
        char direction = in.next().charAt(0);
        switch (direction) 
        {
          case 'a': playerX--; break;
          case 's': playerY--; break;
          case 'd': playerX++; break;
          case 'w': playerY++; break;
        }
        moves++;
        System.out.println("");
        if(moves % 10 == 0) 
        {
          prizeX = (int)(Math.random()* 10) + 1;
          prizeY = (int)(Math.random()* 10) + 1;
          System.out.println(prizeX + " " + prizeY);
        }
      }
      while(Math.abs(playerX) != Math.abs(prizeX) || Math.abs(playerY) != Math.abs(prizeY));
      if(bestScore == 0) bestScore = moves;
      if(moves < bestScore) bestScore = moves;
      System.out.println("Congratulations, you found the prize!");
      System.out.println("Your best score is " + bestScore);
      System.out.print("Would you like to play another game(y/n): ");
    }
    while(in.next().charAt(0) == 'y');
    in.close();
  }
}