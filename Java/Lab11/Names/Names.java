import java.util.*;

public class Names 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    final int ARRAY_LIST_SIZE = 5;
    ArrayList<String> names = new ArrayList<String>();
    for(int i = 0; i < ARRAY_LIST_SIZE; i++) 
    {
      System.out.print("\nEnter name #" + (i+1) + ": ");
      names.add(in.next());
    }
    System.out.println("\nThe names in the list are: " + names.toString());
    boolean duplicates = false;
    for(int i = 0; i < ARRAY_LIST_SIZE - 1; i++) 
    {
      for(int j = i+1; j < ARRAY_LIST_SIZE - 1; j++) 
      {
        if(names.get(i).equals(names.get(j))) 
        {
          names.remove(j);
          duplicates = true;
        }
      }
    }
    if(duplicates) 
    {
      System.out.println("The duplicates were removed and the list now includes: " + names.toString());
    }
    Collections.sort(names);
    System.out.println("The sorted list of names is: " + names.toString());
    names.remove(0);
    names.remove(names.size() - 1);
    System.out.print("Enter a name: ");
    names.add(0, in.next());
    System.out.print("\nEnter a name: ");
    names.add(in.next());
    System.out.println("\nThe names in the list are: " + names.toString());
    Collections.sort(names);
    for(int i = 0; i < names.size() / 2; i++) 
    {
      String temp = names.get(i);
      names.set(i, names.get(names.size() -  1 - i));
      names.set(names.size() - 1 - i, temp);
    }
    System.out.println("The list of names sorted in reverse order is: " + names.toString());
    in.close();
  }
}