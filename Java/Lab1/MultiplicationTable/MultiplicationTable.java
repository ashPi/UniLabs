public class MultiplicationTable 
{
  public static void main (String[] args) 
  {
    int numberRowsCols = 5;
    for (int i = 1; i <= numberRowsCols; i++) 
    {
      for(int j = 1; j <= numberRowsCols; j++) 
      {
        System.out.printf("%7d", i*j);
      }
      System.out.println("");
    }
  }
}