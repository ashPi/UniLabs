import java.util.Scanner;

public class RowColSums 
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
  
  public static int rowSum(int row, int[][] myArray) 
  {
    int sum = 0;
    for(int i = 0;i < myArray[row].length;i++) 
    {
      sum+= myArray[row][i];
    }
    return sum;
  }
  
  public static int colSum(int col, int[][] myArray) 
  {
    int sum = 0;
    for(int i = 0;i < myArray.length; i++) 
    {
      sum+=myArray[i][col];
    }
    return sum;
  }
  
  public static void main(String[] args) 
  {
    int[][] table = 
    {
      {3, -5, 8, -2, 7},
      {4, 8, -3, 2, -8},
      {-5, 8, -9, 4, 6},
      {1, -6, 3, 9, -11},
      {6, 8, -3, -5, 8}
    };
    System.out.println("Table: ");
    printArray(table);
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of the column you would like to sum up: ");
    int col = in.nextInt() - 1;
    System.out.println("The sum of column " + (col + 1) + " is " + colSum(col, table));
    System.out.println("Enter the number of the row you would like to sum up: ");
    int row = in.nextInt() - 1;
    System.out.println("The sum of row " + (row + 1) + " is " + rowSum(row, table));
    in.close();
  }
}