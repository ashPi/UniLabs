import java.util.Arrays;

public class SwitchHalves 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i = 0;i < arrayLength;i++) 
    {
      myArray[i] = (int) (Math.random() * 100) + 1;
    }
    return myArray;
  }
  
  public static int[] switchHalves(int[] myArray) 
  {
    for(int i = 0;i < myArray.length / 2; i++) 
    {
      int swap = myArray[i];
      myArray[i] = myArray[myArray.length / 2 + i];
      myArray[myArray.length / 2 + i] = swap;
    }
    return myArray;
  }
  
  public static void main(String[] args) 
  {
    int[] elements = new int[10];
    generateArrayElements(10, elements);
    System.out.println("Array: " + Arrays.toString(elements));
    switchHalves(elements);
    System.out.println("Array after switching halves: " + Arrays.toString(elements));
    System.out.println("Array after switching halves: " + Arrays.toString(switchHalves(elements)));
  }
}