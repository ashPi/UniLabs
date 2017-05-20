import java.util.Scanner;

public class ComputerOrder 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Number of computers: ");
    int computers = in.nextInt();
    System.out.println("");
    System.out.println("Express delivery (1/0): ");
    int delivery = in.nextInt();
    System.out.println(delivery);
    final int PRICE = 300;
    final double DISCOUNT20 = 0.9;
    final double DISCOUNT50 = 0.8;
    final double EXPRESS_DELIVERY = 7.50;
    double total = 0;
    double deliveryPrice = 0;
    System.out.println("Number of computers: " + computers);
    System.out.println("Delivery: " + (delivery == 1 ? "express" : "regular"));
    int computersPrice = computers * PRICE;
    System.out.println("Cost before discount: " + computersPrice);
    if(computers >= 20) 
    {
      computersPrice*= DISCOUNT20;
    }
    else if(computers >= 50) 
    {
      computersPrice*= DISCOUNT50;
    }
    else 
    {
      computersPrice = computersPrice;
    }
    System.out.println("Cost after discount: " + computersPrice);
    if(delivery == 1) deliveryPrice+= computers * EXPRESS_DELIVERY;
    System.out.println("Cost for delivery: " + deliveryPrice);
    total+= computersPrice + deliveryPrice;
    System.out.println("Total cost of the order: " + total);
    in.close();
  }
}