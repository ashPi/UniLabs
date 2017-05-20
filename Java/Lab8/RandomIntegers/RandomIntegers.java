public class RandomIntegers 
{
  public static void main(String[] args) 
  {
    int[] integers= new int[10];
    for(int i =0; i < integers.length; i++) 
    {
      integers[i] = (int) (Math.random()*100) + 1; 
    }
    System.out.println("Array: ");
    for(int i = 0; i < integers.length; i++) 
    {
      System.out.println(integers[i]);
    }
    System.out.print("Elements with even index: ");
    for(int i = 0; i < integers.length; i+=2) 
    {
      System.out.print(integers[i] + " ");
    }
    System.out.println("\nEven elements: ");
    for(int i = 0; i < integers.length; i++) 
    {
      if(integers[i] % 2 == 0) 
      {
        System.out.print(integers[i] + " ");
      }
    }
    System.out.println("\nElements in a reverse order: ");
    for(int i = integers.length - 1; i >= 0; i--) 
    {
      System.out.println(integers[i]);
    }
    System.out.println("\nFirst and last element: " + integers[0] + " " + integers[integers.length - 1]);
  }
}