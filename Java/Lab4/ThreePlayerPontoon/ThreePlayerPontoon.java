import java.util.Scanner;

public class ThreePlayerPontoon 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    char anotherGame;
    boolean playerOneLost = false, playerTwoLost = false, bankerWon = false;
    do
    {
      char anotherCard;
      int cardPlayerOne, cardPlayerTwo, cardBanker, totalPlayerOne = 0, totalPlayerTwo = 0, totalBanker = 0;
      
      System.out.println("\nNow is the turn of player 1");
      cardPlayerOne = (int)(Math.random()*10) + (int)(Math.random()*10) + 2;
      totalPlayerOne+= cardPlayerOne;
      System.out.println("Player 1`s total so far is " + totalPlayerOne); 
      System.out.print("Would you like to draw another card?(y/n): ");
      anotherCard = in.next().charAt(0);
      System.out.println("");
      
      while(anotherCard == 'y')
      {
        cardPlayerOne = (int)(Math.random()*10) + 1;
        totalPlayerOne+= cardPlayerOne;
        
        if(totalPlayerOne > 21) 
        /*{
          System.out.println("Player 1`s card is " + cardPlayerOne + " .Player 1`s total so far is " + totalPlayerOne);
          System.out.println("Sorry, player 1`s busted and loses :(");
          //anotherCard = 'n';
          playerOneLost = true;
          //break;
          
          System.out.println("\nNow is the turn of player 2");
          cardPlayerTwo = (int)(Math.random()*10) + (int)(Math.random()*10) + 2;
          totalPlayerTwo+= cardPlayerTwo;
          System.out.println("Player 1`s total so far is " + totalPlayerTwo); 
          System.out.print("Would you like to draw another card?(y/n): ");
          anotherCard = in.next().charAt(0);
          System.out.println("");
          while(anotherCard == 'y')
          {
            cardPlayerTwo = (int)(Math.random()*10) + 1;
            totalPlayerTwo+= cardPlayerTwo;
            
            if(totalPlayerTwo <= 21) 
            {
              System.out.println("Player 1`s card is " + cardPlayerTwo + " .Player 1`s total so far is " + totalPlayerTwo);
              System.out.print("Would you like to draw another card?(y/n): ");
              anotherCard = in.next().charAt(0);
              System.out.println("");
            }
            else
            {
              System.out.println("Player 2`s card is " + cardPlayerTwo + " .Player 2`s total so far is " + totalPlayerTwo);
              System.out.println("Sorry, player 2`s busted and also loses :(");
              playerTwoLost = true;
              break;
            }
          }
          if(playerTwoLost) 
          {
            playerTwoLost = false;
            System.out.print("Would you like to play another game? (y/n): ");
            anotherGame = in.next().charAt(0);
          }
          else
          {
            System.out.println("\nNow is the turn of the banker");
            cardBanker = (int)(Math.random()*10) + (int)(Math.random()*10) + 2;
            totalBanker+= cardBanker;
            System.out.println("Banker`s total so far is " + totalBanker);
            while(totalBanker < totalPlayerTwo || totalBanker > 21) 
            {
              cardBanker = (int)(Math.random()*10) + 1;
              totalBanker+= cardBanker;
              System.out.println("Banker`s card is " + cardBanker + " His total so far is " + totalBanker);
            }
            
            if(totalBanker > 21) 
            {
              System.out.println("The banker`s busted!");
              System.out.println("Congratulations, player 2 wins :)");
            }
            else 
            {
              System.out.println("Sorry, the banker beats player 2 as well and you lose :(");
            }
            //System.out.print("Would you like to play another game? (y/n): ");
            //anotherGame = in.next().charAt(0);
            playerTwoLost = true;
          }
        }*/
        else 
        {
          System.out.println("Player 1`s card is " + cardPlayerOne + " .Player 1`s total so far is " + totalPlayerOne);
          System.out.print("Would you like to draw another card?(y/n): ");
          anotherCard = in.next().charAt(0);
          System.out.println("");
        }
      }
        
      if(playerOneLost == true && playerTwoLost == true) 
      {
        playerOneLost = false;
        playerTwoLost = false;
        System.out.print("Would you like to play another game? (y/n): ");
        anotherGame = in.next().charAt(0);
      }
      else if()
      else 
      {
        System.out.println("\nNow is the turn of the banker");
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