import java.util.*;

public class GolfScores 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner (System.in);
    ArrayList<Integer> golfScores = new ArrayList<>();
    do 
    {
      System.out.println("Enter score(-1 for exit):");
      golfScores.add(in.nextInt());
    }
    while(golfScores.get(golfScores.size() - 1) != -1);
    golfScores.remove(golfScores.size() - 1);
    System.out.println("The scores are: " + golfScores);
    int mean = 0, highest = golfScores.get(0), lowest = golfScores.get(0);
    for(Integer golfScore : golfScores) 
    {
      mean+= golfScore;
      if(golfScore > highest) 
      {
        highest = golfScore;
      }
      if(golfScore < lowest) 
      {
        lowest = golfScore;
      }
    }
    System.out.println("The highest score is " + highest);
    System.out.println("The lowest score is " + lowest);
    System.out.println("The mean is " + mean / golfScores.size());
  }
}