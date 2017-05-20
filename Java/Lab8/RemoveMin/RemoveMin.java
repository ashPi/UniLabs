import java.util.Arrays;

public class RemoveMin 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i =0; i < arrayLength; i++) 
    {
      myArray[i] = (int) (Math.random() * 100) + 1;
    }
    return myArray;
  }
  
  public static void removeMin (int[] myArray) 
  {
    int min = myArray[0], index = 0;
    for(int i =0; i < myArray.length; i++) 
    {
      if(myArray[i] < min) 
      {
        min = myArray[i];
        index = i;
      }
    }
    myArray[index] = myArray[myArray.length - 1];
  }
  
  public static void main(String[] args) 
  {
    int elements[] = new int[10];
    generateArrayElements(10, elements);
    System.out.println("Array: " + Arrays.toString(elements));
    removeMin(elements);
    System.out.print("Array without the minimum: [");
    for(int i =0;i < elements.length - 2; i++) 
    {
      if(i == elements.length - 3) 
      {
        System.out.println(elements[i] + "]");
      }
      else 
      {
        System.out.print(elements[i] + ", ");
      }
    }
  }
}