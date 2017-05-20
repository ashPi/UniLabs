import java.util.*;

public class AppendArrayLists 
{
  public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) 
  {
    for(int i = 0; i < b.size(); i++) 
    {
      a.add(b.get(i));
    }
    return a;
  }
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
    ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
    do 
    {
      System.out.println("Enter numbers for the first list(q for exit): ");
      firstArrayList.add(in.nextInt());
    }
    while(in.hasNextInt());
    //firstArrayList.remove(firstArrayList.size() - 1);
    System.out.println("First array list contains the following integers: " + firstArrayList.toString());
    in.close();
    in = new Scanner(System.in);
    do 
    {
      System.out.println("Enter numbers for the second list(q for exit): ");
      secondArrayList.add(in.nextInt());
    }
    while(in.hasNextInt());
    System.out.println("Second array list contains the following integers: " + secondArrayList.toString());
    in.close();
    System.out.println("Appending second array list to first array list...");
    System.out.println("Result: " + append(firstArrayList, secondArrayList).toString());
  }
}