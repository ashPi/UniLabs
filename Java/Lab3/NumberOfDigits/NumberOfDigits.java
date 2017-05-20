import java.util.Scanner;

public class NumberOfDigits 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    //10 000 000 000;
    System.out.print("Enter an integer smaller than 10 000 000 000: ");
    int number = in.nextInt();
    System.out.println("");
    int temp = Math.abs(number);
    int digits;
    for(digits = 1; digits <= 11; digits++) 
    {
      temp/= 10;
      if(temp == 0) break;
    }
    //System.out.println((int)5/10);
    System.out.println(number + " has " + digits + " digits");
    in.close();
  }
}