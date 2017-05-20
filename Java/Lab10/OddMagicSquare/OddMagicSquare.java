import java.util.Scanner;

public class OddMagicSquare 
{
  public static int[][] constructSquare(int n, int[][] myArray) 
  {
    int row = n - 1, col = n / 2;
    int prRow = row, prCol = col;
    for(int k = 1; k <= n * n; k++) 
    {
      myArray[row][col] = k;
      
      row++;
      col++;
      if(row == n)
      {
        row = 0;
      }
      if(col == n) 
      {
        col = 0;
      }
      if(myArray[row][col] != 0) 
      {
        row = prRow - 1;
        col = prCol;
      }
      prRow = row;
      prCol = col;
    }
    return myArray;
  }
  
  public static void printArray(int[][] myArray) 
  {
    for(int i = 0; i < myArray.length; i++) 
    {
      for(int j = 0; j < myArray[i].length; j++) 
      {
        System.out.printf("%3d ", myArray[i][j]);
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) 
  {
    int N;
    Scanner in = new Scanner(System.in);
    do 
    {
      System.out.println("Enter the number of rows and columns: ");
      N = in.nextInt();
    }
    while(N % 2 == 0);
    in.close();
    int[][] square = new int[N][N];
    constructSquare(N, square);
   printArray(square);
  }
}