import java.util.Arrays;

public class AlternatingSum 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i =0;i < arrayLength; i++) 
    {
      myArray[i] = (int) (Math.random() * 100) + 1;
    }
    return myArray;
  }
  
  public static int alternatingSum(int[] myArray) 
  {
    int sum = 0;
    for(int i =0;i < myArray.length; i++) 
    {
      if(i % 2 == 0) 
      {
        sum+= myArray[i];
      }
      else 
      {
        sum-= myArray[i];
      }
    }
    return sum;
  }
  
  public static void main(String[] args) 
  {
    int elements[] = new int[10];
    generateArrayElements(10, elements);
    System.out.println("Array: " + Arrays.toString(elements));
    System.out.println("THe alternating sum of the elements is " + alternatingSum(elements));
  }
}