import java.util.Scanner;

public class MagicSquare 
{
  public static int checkRows(int[][] myArray) 
  {
    int[] sum = new int[myArray.length];
    for(int i = 0; i < myArray.length; i++) 
    {
      for(int j = 0; j < myArray[i].length; j++) 
      {
        sum[i]+= myArray[i][j];
      }
    }
    for(int i = 1; i < sum.length; i++) 
    {
      if(sum[0] != sum[i]) 
      {
        sum[0] = 0;
        break;
      }
    }
    return sum[0];
  }
  
  public static int checkCols(int[][] myArray) 
  {
    int[] sum = new int[myArray[0].length];
    for(int i = 0; i < myArray[0].length; i++) 
    {
      for(int j = 0; j < myArray.length; j++) 
      {
        sum[i]+= myArray[i][j];
      }
    }
    for(int i = 1; i < sum.length; i++) 
    {
      if(sum[0] != sum[i]) 
      {
        sum[0] = 0;
        break;
      }
    }
    return sum[0];
  }
  
  public static int checkDiagonals(int[][] myArray) 
  {
    int[] sum = new int[2];
    for(int i = 0; i < myArray.length; i++) 
    {
      sum[0]+= myArray[i][i];
    }
    for(int i = myArray.length - 1; i >= 0; i--) 
    {
      sum[1]+= myArray[i][i];
    }
    if(sum[0] != sum[1]) 
    {
      sum[0] = 0;
    }
    return sum[0];
  }
  
  public static boolean checkNumbers(int[][] myArray) 
  {
    boolean flag = true;
    int[] set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    for(int i = 0; i < set.length; i++) 
    {
      boolean number = false;
      for(int j = 0; j < myArray.length; j++) 
      {
        for(int k = 0; k < myArray[j].length; k++) 
        {
          if(set[i] == myArray[j][k]) 
          {
            number = true;
            break;
          }
        }
        if(number)
        {
          break;
        }
      }
      if(!(number)) 
      {
        flag = false;
        break;
      }
    }
    return flag;
  }
  
  public static void main(String[] args) 
  {
    final int N = 5;
    /*int[][] magicSquare = 
    {
      {16, 3, 2, 13},
      {5, 10, 11, 8},
      {9, 6, 7, 12},
      {4, 15, 14, 1}
    }; */
    
    int[][] magicSquare = new int[N][N];
    Scanner in = new Scanner(System.in);
    do 
    {
      System.out.println("Enter the numbers in the square: ");
      for(int i = 0; i < N; i++) 
      {
        for(int j = 0; j < N; j++) 
        {
          magicSquare[i][j] = in.nextInt();
        }
      }
      
      for(int i = 0; i < N; i++) 
      {
        for(int j = 0; j < N; j++) 
        {
          System.out.printf("%2d ", magicSquare[i][j]);
        }
        System.out.println("");
      }
    }
    while(!checkNumbers(magicSquare));
    in.close();
    
    if(checkRows(magicSquare) != 0 && checkCols(magicSquare) != 0 && checkDiagonals(magicSquare) != 0 && checkRows(magicSquare) == checkCols(magicSquare) && checkRows(magicSquare) == checkDiagonals(magicSquare)) 
    {
      System.out.println("The square is magic");
    }
    else 
    {
      System.out.println("The square is not magic");
    }
  }
}