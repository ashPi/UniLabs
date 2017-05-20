import java.util.*;

public class MergeArrayLists 
{
  public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) 
  {
    ArrayList<Integer> newArrayList = new ArrayList<Integer>();
    int longer;
    if(a.size() >= b.size()) 
    {
      longer = a.size();
    }
    else 
    {
      longer = b.size();
    }
    for(int i = 0; i < longer; i++) 
    {
      if(i < a.size()) 
      {
        newArrayList.add(a.get(i));
      }
      if(i < b.size()) 
      {
        newArrayList.add(b.get(i));
      }
    }
    return newArrayList;
  }
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
    ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
    do 
    {
      System.out.println("Enter numbers for the first list(q for exit):");
      firstArrayList.add(in.nextInt());
    }
    while(in.hasNextInt());
    in.close();
    in = new Scanner(System.in);
    do 
    {
      System.out.println("Enter numbers for the second list(q for exit): ");
      secondArrayList.add(in.nextInt());
    }
    while(in.hasNextInt());
    in.close();
    System.out.println("The first array list contains the following integers: " + firstArrayList.toString());
    System.out.println("The second array list contains the following integers: " + secondArrayList.toString());
    System.out.println("Merging both array lists...");
    System.out.println("The result is: " + merge(firstArrayList, secondArrayList).toString());
  }
}