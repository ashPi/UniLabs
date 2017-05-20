import java.util.Arrays;
public class FunctionsWithArrays 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i = 0; i < arrayLength; i++) 
    {
      myArray[i] = (int) (Math.random()*7) + 1; 
    }
    return myArray;
  }
  
  public static int maxPosition(int[] myArray) 
  {
    int maxPosition = 0;
    for(int i = 1; i < myArray.length - 1; i++) 
    {
      if(myArray[i] > myArray[maxPosition]) 
      {
        maxPosition = i;
      }
    }
    return maxPosition;
  }
  
  public static int maxPositionString(String myString) 
  {
    String[] myArray = myString.split("");
    int maxPosition = 0;
    for(int i = 1;i < myArray.length;i++) 
    {
      if(myArray[i].toLowerCase().compareTo(myArray[maxPosition].toLowerCase()) > 0) 
      {
        maxPosition = i;
      }
    }
    return maxPosition;
  }
  
  public static int maxValue(int[] myArray) 
  {
    int max = myArray[0];
    for(int i = 1; i < myArray.length - 1; i++) 
    {
      if(myArray[i] > max) 
      {
        max = myArray[i];
      }
    }
    return max;
  }
  
  public static String maxValueString(String myString) 
  {
    String[] myArray = myString.split("");
    String max = myArray[0];
    for(int i = 1;i < myArray.length;i++) 
    {
      if(myArray[i].toLowerCase().compareTo(max.toLowerCase()) > 0) 
      {
        max = myArray[i];
      }
    }
    return max;
  }
  
  public static int searchFor(int element, int[] myArray) 
  {
    int position = -1;
    for(int i = 0;i < myArray.length;i++) 
    {
      if(myArray[i] == element) 
      {
        position = i;
        break;
      }
    }
    return position;
  }
  
  public static int minValue(int[] myArray) 
  {
    int min = myArray[0];
    for(int i = 1;i < myArray.length;i++) 
    {
      if(myArray[i] < min) 
      {
        min = myArray[i];
      }
    }
    return min;
  }
  
  public static int[] minMaxRange(int[] myArray) 
  {
    int[] returnArray = {minValue(myArray), maxValue(myArray), maxValue(myArray) - minValue(myArray)};
    return returnArray;
  }
  
  public static void main(String[] args) 
  {
    int[] integers= new int[10];
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("Max value is at position " + maxPosition(integers) + " and is " + maxValue(integers));
    String input = "dhjckhewads";
    System.out.println("The max value of " + input + " is at position " + maxPositionString(input) + " and is " + maxValueString(input));
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("The position of 10 in the array is " + searchFor(10, integers));
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("The minimum value, the maximum value and the range of the array is " + Arrays.toString(minMaxRange(integers)));
  }
}