import java.util.Scanner;

public class MarkAnalyser 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out. print("Enter number of marks to be analysed: ");
    int marks = in.nextInt();
    System.out.println("");
    int fail = 0, pass = 0, distinction = 0;
    double temp;
    double overallMark = 0;
    for(int i = 0; i < marks; i++) 
    {
      System.out.print("Enter mark �" + (i + 1) + ": ");
      temp = in.nextDouble();
      System.out.println("");
      if(temp < 40) fail++;
      else if(temp < 75) pass++;
      else distinction++;
      overallMark+= temp;
      System.out.println("");
    }
    System.out.println("Number of fails: " + fail);
    System.out.println("Number of passes: " + pass);
    System.out.println("Number of distinctions: " + distinction);
    System.out.printf("Overall average mark: %.2f\n", (double)(overallMark / marks));
    in.close();
  }
}