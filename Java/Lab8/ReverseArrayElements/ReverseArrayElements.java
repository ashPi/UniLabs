import java.util.Arrays;

public class ReverseArrayElements 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i = 0;i < arrayLength;i++) 
    {
      myArray[i] = (int) (Math.random()*100) + 1;
    }
    return myArray;
  }
  
  public static void reverseArrayElements(int[] myArray) 
  {
    int swap;
    for(int i = 0; i <= (myArray.length - 1) / 2;i++) 
    {
      swap = myArray[i];
      myArray[i] = myArray[myArray.length - 1 - i];
      myArray[myArray.length - 1 - i] = swap;
    }
  }
  
  public static void main(String[] args) 
  {
    int elements[] = new int[7];
    generateArrayElements(7, elements);
    System.out.println("Array: " + Arrays.toString(elements));
    reverseArrayElements(elements);
    System.out.println("Reversed array: " + Arrays.toString(elements));
  }
}