public class CreateArray 
{
  public static int[][] populateArray3X3(int[][] myArray) 
  {
    for(int i = 0;i < 3;i++) 
    {
      for(int j =0;j < 3;j++) 
      {
        myArray[i][j] = (int) (Math.random() * 100) + 1;
      }
    }
    return myArray;
  }
  
  public static void createArrayNxN(int n) 
  {
    int[][] myArray = new int[n][n];
    for(int i = 0;i < n;i++) 
    {
      for(int j = 0;j < n;j++) 
      {
        myArray[i][j] = (int)(Math.random() * 100) + 1;
      }
    }
    System.out.println("Array NxN: ");
    printArray(myArray);
  }
  
  public static void printArray(int[][] myArray) 
  {
    for(int i = 0;i < myArray.length;i++) 
    {
      for(int j = 0;j < myArray[i].length;j++) 
      {
        System.out.printf("%3d ", myArray[i][j]);
      }
      System.out.println();
    }
  }
  
  public static void createArrayNxM(int n, int m) 
  {
    int[][] myArray = new int[n][m];
    for(int i = 0;i < n;i++) 
    {
      for(int j = 0;j < m;j++) 
      {
        myArray[i][j] = (int) (Math.random() * 100) + 1;
      }
    }
    System.out.println("Array NxM: ");
    printArray(myArray);
  }
  
  public static void main(String[] args) 
  {
    final int ROWSCOLS = 3;
    int[][] firstArray = new int[ROWSCOLS][ROWSCOLS];
    populateArray3X3(firstArray);
    System.out.println("First Array: ");
    printArray(firstArray);
    final int N = 7;
    createArrayNxN(N);
    final int N1 = 6;
    final int M = 4;
    createArrayNxM(N1, M);
  }
}