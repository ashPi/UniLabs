import java.util.Arrays;

public class ArrayMethods 
{
  public static int[] generateArrayElements(int arrayLength, int[] myArray) 
  {
    for(int i =0; i < arrayLength; i++) 
    {
      myArray[i] = (int) (Math.random()*100) + 1; 
    }
    return myArray;
  }
  public static int[] swapElements(int[] myArray) 
  {
    int swap = myArray[0];
    myArray[0] = myArray[myArray.length - 1];
    myArray[myArray.length - 1] = swap;
    return myArray;
  }
  
  public static int[] shiftElements(int[] myArray) 
  {
    int shift = myArray[myArray.length - 1];
    for(int i = myArray.length - 1; i > 0; i--) 
    {
      myArray[i] = myArray[i - 1];
    }
    myArray[0] = shift;
    return myArray;
  }
  
  public static int[] replaceEven(int[] myArray) 
  {
    for(int i = 0; i <= myArray.length - 1; i+= 2) 
    {
      myArray[i] = 0;
    }
    return myArray;
  }
  
  public static int[] replaceElementsWithNeighbours(int[] myArray) 
  {
    for(int i = 1; i < myArray.length - 1; i++) 
    {
      if(myArray[i + 1] > myArray[i - 1]) 
      {
        myArray[i] = myArray[i + 1];
      }
      else 
      {
        myArray[i] = myArray[i - 1];
      }
    }
    return myArray;
  }
  
  public static int[] removeElements(int[] myArray) 
  {
    int[] newArray;
    if(myArray.length % 2 == 0) 
    {
     for(int i = myArray.length / 2 - 1; i <= myArray.length - 3; i++) 
     {
       myArray[i] = myArray[i + 2];
     }
     newArray = Arrays.copyOfRange(myArray, 0, myArray.length - 2);
    }
    else 
    {
      for(int i = myArray.length / 2 ; i <= myArray.length - 2; i++) 
     {
       myArray[i] = myArray[i + 1];
     }
     newArray = Arrays.copyOfRange(myArray, 0, myArray.length - 1);
    }
    return newArray;
  }
  
  public static int[] evenElementsToFront(int[] myArray) 
  {
    for(int i =0; i < myArray.length - 1; i++) 
    {
      if(myArray[i] % 2 == 0) 
      {
        int temp = myArray[i];
        for(int j = i; j > 0; j--) 
        {
          myArray[j] = myArray[j - 1];
        }
        myArray[0] = temp;
      }
    }
    return myArray;
  }
  
  public static int secondLargestElement(int[] myArray) 
  {
    int max, i = myArray.length - 2;
    Arrays.sort(myArray);
    max = myArray[i];
    while(myArray[myArray.length - 1] == max) 
    {
      i--;
      max = myArray[i]; 
    }
    return max;
  }
  
  public static boolean isIncreasing( int[] myArray) 
  {
    boolean flag = true;
    int i = 0;
    do 
    {
      if(myArray[i] > myArray[i + 1]) 
      {
        flag = false;
      }
      i++;
    }
    while(i < myArray.length - 1 && flag);
    return flag;
  }
  
  public static boolean isDuplicateAdjasent(int[] myArray) 
  {
    boolean flag = false;
    int i =0;
    do 
    {
      if(myArray[i] == myArray[i + 1]) 
      {
        flag = true;
      }
      i++;
    }
    while(!(flag) && i < myArray.length - 1);
    return flag;
  }
  
  public static boolean isDuplicateElement(int[] myArray) 
  {
    boolean flag = false;
    for(int i =0; i < myArray.length - 2; i++) 
    {
      for(int j = i +1; j < myArray.length - 1; j++) 
      {
        if(myArray[i] == myArray[j]) 
        {
          flag = true; 
          break;
        }
      }
      if(flag) 
      {
        break;
      }
    }
    return flag;
  }
  
  public static void main(String[] args) 
  {
    int[] integers= new int[10];
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    swapElements(integers);
    System.out.println("First anad last element swapped: " + Arrays.toString(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    shiftElements(integers);
    System.out.println("Shifted elements: " + Arrays.toString(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    replaceEven(integers);
    System.out.println("Even elements replaced with zero: " + Arrays.toString(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    replaceElementsWithNeighbours(integers);
    System.out.println("Elements replaced with their bigger neighbour: " + Arrays.toString(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("Array after removing middle element(s): " + Arrays.toString(removeElements(integers)));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    evenElementsToFront(integers);
    System.out.println("Even elements moved to the front: " + Arrays.toString(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("Second largest element: " + secondLargestElement(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("The elements are in increasing order: " + isIncreasing(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("There are duplicating adjasent elements: " + isDuplicateAdjasent(integers));
    
    generateArrayElements(10, integers);
    System.out.println("Array: " + Arrays.toString(integers));
    System.out.println("There are duplicating elements: " + isDuplicateElement(integers));
  }
}