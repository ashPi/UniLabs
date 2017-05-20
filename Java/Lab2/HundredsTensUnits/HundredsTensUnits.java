import java.util.Scanner;

public class HundredsTensUnits 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a three digit whole number: ");
    System.out.println("");
    int inputNumber = in.nextInt();
    int units = inputNumber % 10;
    int tens = (inputNumber % 100)/10;
    int hundreds = inputNumber / 100;
    System.out.println("Hundreds: " + hundreds);
    System.out.println("Tens: " + tens);
    System.out.println("Units: " + units);
    in.close();
  }
}