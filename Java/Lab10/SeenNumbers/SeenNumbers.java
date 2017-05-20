import java.util.Arrays;

public class SeenNumbers 
{
  public static boolean areAllSeen(boolean[] myArray) 
  {
    boolean flag = true;
    for(int i = 0; i < myArray.length; i++) 
    {
      if(!(myArray[i])) 
      {
        flag = false;
        break;
      }
    }
    return flag;
  }
  
  public static void main(String[] args) 
  {
    int[] numArray = {4, 3, 2, 1, 0};
    boolean[] seenNumbers = new boolean[5];
    /*for(int i = 0; i < 5; i++) 
    {
      numArray[i] = (int) (Math.random() * 4);
    }*/
    for(int i = 0; i < 5; i++) 
    {
      seenNumbers[i] = false;
      for(int j = 0; j < 5; j++) 
      {
        if(i == numArray[j]) 
        {
          seenNumbers[i] = true;
          break;
        }
      }
    }
    System.out.println("Numbers Array: " + Arrays.toString(numArray));
    System.out.println("Seen Numbers: " + Arrays.toString(seenNumbers));
    if(areAllSeen(seenNumbers)) 
    {
      System.out.println("All indeces are present in the number array");
    }
    else 
    {
      System.out.println("Not all indeces are present in the number array");
    }
  }
}