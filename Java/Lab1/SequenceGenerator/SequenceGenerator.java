public class SequenceGenerator 
{
  public static void main(String[] args) 
  {
    final int NUMBER_OF_TERMS = 7;
    final double START_NUMBER = 15.6;
    final double ADDED_AMOUNT = 1.4;
    double temp = 0.0;
    System.out.println("My sequence is ...");
    for (int i = 0; i < NUMBER_OF_TERMS; i++) 
    {
      temp = START_NUMBER + i * ADDED_AMOUNT;
      System.out.println("Number " + (i + 1) + " is " + temp);
    }
 }
}