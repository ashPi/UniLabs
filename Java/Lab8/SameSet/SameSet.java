import java.util.Arrays;

public class SameSet 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i = 0; i < arrayLength; i++) 
    {
      myArray[i] = (int) (Math.random() * 3) + 1;
    }
    return myArray;
  }
  
  public static boolean sameSet(int[] a, int[] b) 
  {
    boolean flag = true;
    if(a.length > b.length) 
    {
      for(int i = 0; i < a.length - 1; i++) 
      {
        boolean sameElement = false;
        for(int j = 0; j < b.length; j++) 
        {
          if(a[i] == b[j]) 
          {
            sameElement = true;
            break;
          }
        }
        if(!(sameElement)) 
        {
          flag = false;
          break;
        }
      }
    }
    else
    {
      for(int i = 0; i < b.length; i++) 
      {
        boolean sameElement = false;
        for(int j = 0; j < a.length; j++) 
        {
          if(b[i] == a[j]) 
          {
            sameElement = true;
            break;
          }
        }
        if(!(sameElement)) 
        {
          flag = false;
          break;
        }
      }
    }
    return flag;
  }
  
  public static void main(String[] args) 
  {
    int firstArray[] = new int[10];
    int secondArray[] = new int[8];
    generateArrayElements(10, firstArray);
    generateArrayElements(8, secondArray);
    System.out.println("First array: " + Arrays.toString(firstArray));
    System.out.println("Second array: " + Arrays.toString(secondArray));
    if(sameSet(firstArray, secondArray)) 
    {
      System.out.println("Both arrays have the same set of elements");
    }
    else 
    {
      System.out.println("The given arrays have a different set of elements");
    }
  }
}