/**
 * A class stores the properties and methods 
 * associated with a Football Team
 * @author Silviya Tacheva
 * @version 1.0 17/02/2017
 */
public class FootballTeam 
{
  
  /**
   * Surnames of the players
   */
  private String[] players = new String[5];
  
  /**
   * The colour of the football kit
   */
  private String colour;
  
  /**
   * Current goal difference
   */
  private int goalDifference;
  
  /**
   * Information whether the team is still in the Challenge
   */
  private boolean inChallenge;
  
  /**
   * Constructor for the FootballTeam object
   */
  public FootballTeam() 
  {
    for(int i = 0; i < 5; i++) 
    {
      this.players[i] = "not assigned";
    }/*
    players[0] = "not assigned";
    players[1] = "not assigned";
    players[2] = "not assigned";
    players[3] = "not assigned";
    players[4] = "not assigned";*/
    this.colour = "not assigned";
    this.goalDifference = 0;
    this.inChallenge = true;
  }
  /*public FootballTeam(String[] myPlayers, String aColour, int aDifference, boolean flag) 
  {
    for(int i = 0; i < 5; i++) 
    {
      players[i] = myPlayers[i];
    }
    colour = aColour;
    goalDifference = aDifference;
    inChallenge = flag;
  }*/
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the surnames of the players 
   * @return The surnames of the players
   */
  public String[] getPlayers() 
  {
    return players;
  }
  
  /**
   * Gets the colour of the football kit
   * @return The colour of the kit
   */
  public String getColour() 
  {
    return colour;
  }
  
  /**
   * Gets the current goal difference
   * @return The goal difference
   */
  public int getGoalDifference() 
  {
    return goalDifference;
  }
  
  /**
   * Gets the information whether the tema is still in the Challenge
   * @return Information whether the team is in the Challenge
   */
  public boolean getInChallenge() 
  {
    return inChallenge;
  }
  
  //------------Setter Methods-----------------
  
  /**
   * Sets the surnames of the players 
   * @param names The surnames of the players
   */
  public void setPlayers(String[] names) 
  {
    for(int i = 0; i < names.length; i++) 
    {
      players[i] = names[i];
    }
  }
  
  /**
   * Sets the colour of the football kit
   * @param aColour The colour of the kit
   */
  public void setColour(String aColour) 
  {
    colour = aColour;
  }
  
  /**
   * Sets the current goal difference
   * @param difference The goal difference
   */
  public void setGoalDifference(int difference) 
  {
    goalDifference = difference;
  }
  
  /**
   * Sets the information whether the tema is still in the Challenge
   * @return information Information whether the team is in the Challenge
   */
  public void setInChallenge(boolean information) 
  {
    inChallenge = information;
  }
  
  //------------Other Methods-----------------
  
  /**
   * Adds a player into an empty cell of the players[] array
   * @param player The surname of the player to be added
   */
  public void addPlayer(String player) 
  {
    boolean noEmptyCell = true;
    for(int i = 0; i < players.length; i++) 
    {
      if(players[i] == "not assigned") 
      {
        noEmptyCell = false;
        players[i] = player;
        break;
      }
    }
    if(noEmptyCell) 
    {
      System.out.println("The team is already full and you cannot add other players!");
      //System.out.println(getPlayers()[5]);
    }
  }
  
  /**
   * Replaces the name of a player at a given index with "not assigned"
   * @param index The index of the name to be removed
   * @return Information whether the removal was successful or not
   */
  public boolean removePlayer(int index) 
  {
    boolean successful = true;
    if(index >= players.length || index < 0 || players[index] == "not assigned") 
    {
      successful = false;
    }
    else 
    {
      players[index] = "not assigned";
    }
    return successful;
  }
  
  /**
   * Looks through the players[] array and finds whether a particular player is in the team
   * @param item The name of a player to search for
   * @return Information whether the particular player is in the team
   */
  public boolean searchItem(String item) 
  {
    boolean inTeam = false;
    for(int i = 0; i < players.length; i++) 
    {
      if(players[i] == item) 
      {
        inTeam = true;
        break;
      }
    }
    return inTeam;
  }
  
  /**
   * Replaces one player with another
   * @param currentPlayer The name of the player to be replaced
   * @param newPlayer The name of the new player
   */
  public void replacePlayer(String currentPlayer, String newPlayer) 
  {
    for(int i = 0; i < players.length; i++) 
    {
      if(players[i] == currentPlayer) 
      {
        players[i] = newPlayer;
      }
    }
  }
  
  /**
   * Prints out whether the team is still in the competition
   */
  public void isCompeting() 
  {
    if(inChallenge) 
    {
      System.out.println("The team is still in the competition");
    }
    else 
    {
      System.out.println("The team is not in the competition anymore");
    }
  }
  
  /**
   * A string representation of the contents of the fields of a FootballTeam object
   * @return Information in the fields of a FootballTeam
   */
  public String toString() 
  {
    String contents = "Surnames of the players: ";
    for(int i = 0; i < getPlayers().length; i++) 
    {
      contents+= getPlayers()[i] + " ";
    }
    contents+= "\nColour of the football kit: " + getColour();
    contents+= "\nGoal difference: " + getGoalDifference();
    contents+= "\nThe team is still in the challenge: " + getInChallenge();
    return contents;
  }
}