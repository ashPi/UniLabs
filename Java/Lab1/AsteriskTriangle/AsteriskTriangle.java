public class AsteriskTriangle 
{
  public static void main (String[] args) 
  {
    //first trinagle
    final int NUMBER_OF_LINES_FIRST = 4;
    for (int i = 1; i <= NUMBER_OF_LINES_FIRST; i++) 
    {
      for(int j = 1; j <= i; j++) 
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("");
    //second trinagle
    final int NUMBER_OF_LINES_SECOND = 7;
    for (int i = NUMBER_OF_LINES_SECOND; i >= 1; i--) 
    {
      for(int j = i; j >= 1; j--) 
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}