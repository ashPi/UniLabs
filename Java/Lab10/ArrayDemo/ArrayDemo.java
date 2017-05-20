public class ArrayDemo 
{
  public static void printArray(int[][] myArray) 
  {
    for(int i = 0;i < myArray.length;i++) 
    {
      for(int j = 0;j < myArray[i].length;j++) 
      {
        System.out.printf("%3d ", myArray[i][j]);
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) 
  {
    int[][] firstArray = new int[2][3];
    for(int i = 0;i < firstArray.length;i++) 
    {
      for(int j = 0;j < firstArray[i].length;j++) 
      {
        firstArray[i][j] = (int) (Math.random() * 20) - 10;
      }
    }
    System.out.println("First Array: ");
    printArray(firstArray);
    int[][] secondArray = 
    {
      {6, 5, 7},
      {3, 8, 4},
      {4, 9, 6}
    };
    System.out.println("Second Array: ");
    printArray(secondArray);
  }
}