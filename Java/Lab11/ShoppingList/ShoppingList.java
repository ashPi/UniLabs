import java.util.*;

public class ShoppingList 
{
  public static ArrayList<String> addItem(String item, ArrayList<String> myArrayList) 
  {
    myArrayList.add(item);
    return myArrayList;
  }
  
  public static ArrayList<String> removeItem(int index, ArrayList<String> myArrayList) 
  {
    myArrayList.remove(index);
    return myArrayList;
  }
  
  public static boolean searchItem(String item, ArrayList<String> myArrayList) 
  {
    boolean flag = false;
    for(int i = 0; i < myArrayList.size(); i++) 
    {
      //System.out.println(i);
      if(item.equals(myArrayList.get(i))) 
      {
        flag = true;
        break;
      }
    }
    return flag;
  }
  
  public static ArrayList<String> changeItem(String itemToChange, String newItem, ArrayList<String> myArrayList) 
  {
    for(int i = 0; i < myArrayList.size(); i++) 
    {
      if(itemToChange.equals(myArrayList.get(i))) 
      {
        myArrayList.set(i, newItem);
        break;
      }
    }
    return myArrayList;
  }
  
  public static boolean wasRemovalSuccessful(String item, ArrayList<String> myArrayList) 
  {
    boolean flag = false;
    for(int i = 0; i < myArrayList.size(); i++) 
    {
      if(item.equals(myArrayList.get(i))) 
      {
        myArrayList.remove(i);
        flag = true;
        break;
      }
    }
    return flag;
  }
  
  public static String removedItem(String item, ArrayList<String> myArrayList) 
  {
    for(int i = 0; i < myArrayList.size(); i++) 
    {
      if(item.equals(myArrayList.get(i))) 
      {
        myArrayList.remove(i);
        break;
      }
    }
    return item;
  }
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the item you wish to add to your shopping list: ");
    String item = in.next();
    ArrayList<String> shoppingList = new ArrayList<>();
    shoppingList.add("cofee");
    shoppingList.add("bread");
    shoppingList.add("pizza");
    shoppingList.add("bananas");
    addItem(item, shoppingList);
    System.out.println("\nYour list now includes: " + shoppingList.toString());
    System.out.print("Enter the number of the item you would like to remove from your shopping list: ");
    int index = in.nextInt() - 1;
    removeItem(index, shoppingList);
    System.out.println("\nYour shopping list now includes: " + shoppingList.toString());
    System.out.print("Enter the item you would like to find: ");
    item = in.next();
    if(searchItem(item, shoppingList)) 
    {
      System.out.println("\n" + item + " is in your shopping list");
    }
    else 
    {
      System.out.println("\n" + item + " is not in your shopping list");
    }
    System.out.print("Enter the item you would like to change: ");
    String oldItem = in.next();
    System.out.print("\nEnter the item you would like to add at its place: ");
    String newItem = in.next();
    changeItem(oldItem, newItem, shoppingList);
    System.out.println("\nYour shopping list now includes: " + shoppingList);
    System.out.print("Enter an item you would like to remove: ");
    item = in.next();
    if(wasRemovalSuccessful(item, shoppingList)) 
    {
      System.out.print("\nYou removed " + item + " from your shopping list successfully");
    }
    else 
    {
      System.out.print("\nYou removed " + item + " from your shopping list unsuccessfully");
    }
    System.out.println(" .Your shopping list now includes: " + shoppingList.toString());
    System.out.print("Enter an item you would like to remove: ");
    item = in.next();
    System.out.println("\nYou removed " + removedItem(item, shoppingList) + " from your shopping list");
  }
}