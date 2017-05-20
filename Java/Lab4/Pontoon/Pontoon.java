import java.util.Scanner;

public class Pontoon 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    char anotherGame;
    boolean playerLost = false;
    do
    {
      char anotherCard;
      int cardPlayer, cardBanker, totalPlayer = 0, totalBanker = 0;
      cardPlayer = (int)(Math.random()*10) + (int)(Math.random()*10) + 2;
      totalPlayer+= cardPlayer;
      System.out.println("Your total so far is " + totalPlayer); 
      System.out.print("Would you like to draw another card?(y/n): ");
      anotherCard = in.next().charAt(0);
      System.out.println("");
      
      while(anotherCard == 'y')
      {
        cardPlayer = (int)(Math.random()*10) + 1;
        totalPlayer+= cardPlayer;
        
        if(totalPlayer <= 21) 
        {
          System.out.println("Your card is " + cardPlayer + " .Your total so far is " + totalPlayer);
          System.out.print("Would you like to draw another card?(y/n): ");
          anotherCard = in.next().charAt(0);
          System.out.println("");
        }
        else 
        {
          System.out.println("Your card is " + cardPlayer + " .Your total so far is " + totalPlayer);
          System.out.println("Sorry, you`re busted and lose :(");
          playerLost = true;
          break;
        }
        
        if(playerLost) break;
      }
      if(playerLost) 
      {
        playerLost = false;
        System.out.print("Would you like to play another game? (y/n): ");
        anotherGame = in.next().charAt(0);
      }
      else 
      {
        System.out.println("\nNow is the banker`s turn");
        cardBanker = (int)(Math.random()*10) + (int)(Math.random()*10) + 2;
        totalBanker+= cardBanker;
        System.out.println("Banker`s total so far is " + totalBanker);
        while(totalBanker < totalPlayer || totalBanker > 21) 
        {
          cardBanker = (int)(Math.random()*10) + 1;
          totalBanker+= cardBanker;
          System.out.println("Banker`s card is " + cardBanker + " His total so far is " + totalBanker);
        }
        
        if(totalBanker > 21) 
        {
          System.out.println("The banker`s busted!");
          System.out.println("Congratulations, you win :)");
        }
        else 
        {
          System.out.println("Sorry, the banker beats you and you lose :(");
        }
        System.out.print("Would you like to play another game? (y/n): ");
        anotherGame = in.next().charAt(0);
      }
    }
    while( anotherGame == 'y');
    in.close();
  }
}