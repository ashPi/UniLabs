/**
 * A Test Class for the FootballTeam Class 
 * @author Silviya Tacheva
 * @version 1.0 17/02/2017
 */
public class TestFootballTeam 
{
  public static void main(String[] args) 
  {
    //Create an instance of FootballTeam
   /* String[] players = new String[5];
    for(int i = 0; i < players.length; i++) 
    {
      players[i] = "not assigned";
    }
    FootballTeam team = new FootballTeam(players, "white", 0, true);*/
    FootballTeam team = new FootballTeam();
    
    //Test the getters
    System.out.print("Players are: "); 
    for(int i = 0; i < team.getPlayers().length; i++) 
    {
      System.out.print(team.getPlayers()[i] + " ");
    }
    System.out.println("\nColour: " + team.getColour());
    System.out.println("Goal difference: " + team.getGoalDifference());
    System.out.println("The team is competing: " + team.getInChallenge());
    
    //Test setters 
    String[] myPlayers = {"Yakimova", "Kuncheva", "Tacheva", "Toncheva", "Minkov"};
    team.setPlayers(myPlayers);
    team.setColour("pink");
    team.setGoalDifference(7);
    team.setInChallenge(true);
    
    //Test toString() method 
    System.out.println(team.toString());
    
    //Test other methods 
    team.addPlayer("Pisina");
    System.out.println("1 " + team.removePlayer(4));
    System.out.println("2 " + team.removePlayer(3));
    team.addPlayer("Pisina");
    System.out.println("3 " + team.removePlayer(4));
    System.out.println("Vitanova is in the team: " + team.searchItem("Vitanova"));
    team.replacePlayer("Pisina", "Vitanova");
    System.out.println("Pisina is in the team: " + team.searchItem("Pisina"));
    //team.setInChallenge(false);
    team.isCompeting();
    
  } //end of main() method
} //end of Test Class