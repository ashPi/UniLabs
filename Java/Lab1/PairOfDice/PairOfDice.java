public class PairOfDice 
{
  public static void main (String[] args) 
  {
    int firstDie = (int) (Math.random()*6 +1);
    int secondDie = (int) (Math.random()*6 +1);
    System.out.println("You got " + firstDie + " and " + secondDie);
  }
}