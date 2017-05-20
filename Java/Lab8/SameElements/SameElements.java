import java.util.Arrays;

public class SameElements 
{ 
  public static int[] setOfValues(int[] myArray) 
  {
    int[] set = new int[myArray.length];
    set[0] = myArray[0];
    int counter = 1;
    for(int i = 1;i < myArray.length;i++) 
    {
      boolean flag = false;
      for(int j = 0; j <= counter;j++) 
      {
        if(myArray[i] == set[j]) 
        {
          flag = true;
          break;
        }
      }
      if(!(flag)) 
      {
        counter++;
        set[counter] = myArray[i];
      }
    }
    return Arrays.copyOf(set, counter);
  }
  
  public static boolean sameElements(int[] a, int[] b) 
  {
    boolean flag = true;
    if(a.length == b.length) 
    {
      int[] setA = setOfValues(a);
      int[] setB = setOfValues(b);
      Arrays.sort(setA);
      Arrays.sort(setB);
      if(Arrays.equals(setA, setB)) 
      {
        for(int i = 0;i < setA.length;i++) 
        {
          int counterA = 0, counterB = 0;
          for(int j = 0;j < a.length;j++) 
          {
            if(setA[i] == a[j]) 
            {
              counterA++;
            }
            if(setA[i] == b[j]) 
            {
              counterB++;
            }
          }
          if(counterA != counterB) 
          {
            flag = false;
            break;
          }
        }
      }
    }
    else 
    {
      flag = false;
    }
    return flag;
  }
  
  public static void main(String[] args) 
  {
    int[] firstArray = {1, 2, 3, 3, 4, 5, 6 ,7, 10, 10};
    int[] secondArray = {1, 2, 3, 3, 4, 5, 6 ,7, 10, 10};
    System.out.println("First Array: " + Arrays.toString(firstArray));
    System.out.println("Second Array: " + Arrays.toString(secondArray));
    if(sameElements(firstArray, secondArray)) 
    {
      System.out.println("Both arrays are identical");
    }
    else 
    {
      System.out.println("The given arrays are not identical");
    }
  }
}