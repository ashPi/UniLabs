import java.util.*;

public class Supermarket 
{
  public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) 
  {
    int max = 0;
    for(int i = 1; i < sales.size(); i++) 
    {
      if(sales.get(max) < sales.get(i)) 
      {
        max = i;
      }
    }
    return customers.get(max);
  }
  
  public static ArrayList<String> namesOfBestCustomers(ArrayList<Double> sales, ArrayList<String> customers, int topN) 
  {
    ArrayList<String> names = new ArrayList<String>();
    if(topN >= sales.size()) 
    {
      names = new ArrayList<String>(customers);
    }
    else 
    {
      for(int i = 0; i < topN; i++) 
      {
        int max = 0;
        for(int j = 1; j < sales.size() - 1; j++) 
        {
          if(sales.get(max) < sales.get(j)) 
          {
            max = j;
          }
        }
        sales.remove(max);
        names.add(customers.get(max));
        customers.remove(max);
      } 
    }
    return names;
  }
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Double> sales = new ArrayList<Double>();
    ArrayList<String> names = new ArrayList<String>();
    do 
    {
      System.out.print("Customer`s purchase amount: ");
      sales.add(in.nextDouble());
      if(sales.get(sales.size() - 1) != 0) 
      {
        System.out.println("\nCustomer`s name: ");
        names.add(in.next());
      }
    }
    while(sales.get(sales.size() - 1) != 0);
    sales.remove(sales.size() - 1);
    System.out.println("Sales: " + sales.toString());
    System.out.println("Names: " + names.toString());
    System.out.println("Best customer of the day is " + nameOfBestCustomer(sales, names));
    System.out.println("Enter the number of top customers to diplay: ");
    int number = in.nextInt();
    in.close();
    System.out.println("The top " + number + " customers are: " + namesOfBestCustomers(sales, names, number).toString());
  }
}