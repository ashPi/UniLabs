import java.util.Scanner;

public class Room101 
{
  public static double area(double length, double breadth) 
  {
    return length * breadth;
  }
  
  public static double wallArea(double length, double breadth, double height) 
  {
    return 2 * (length * height + breadth * height);
  }
  
  public static double volume(double length, double breadth, double height) 
  {
    return length * breadth * height;
  }
  
  public static double carpetCost(double length, double breadth, double costPerSqM) 
  {
    return area(length, breadth) * costPerSqM;
  }
  
  public static double wallPaintCost(double length, double breadth, double height, double costPerSqM) 
  {
    return wallArea(length, breadth, height) * costPerSqM;
  }
  
  public static int numCarpetTiles(double length, double breadth) 
  {
    return (int)Math.ceil(area(length, breadth));
  }
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the length of the room: ");
    double length = in.nextDouble();
    System.out.print("\nEnter the width of the room: ");
    double width = in.nextDouble();
    System.out.print("\nEnter the height of the room: ");
    double height = in.nextDouble();
    System.out.print("\nEnter the cost of the carpet per sqm: ");
    double carpetCost = in.nextDouble();
    System.out.print("\nEnter the cost of the paint per sqm: ");
    double paintCost = in.nextDouble();
    System.out.println("\nThe area of the floor is " + area(length, width) + "sqm;");
    System.out.println("The total area of the walls is " + wallArea(length, width, height) + "sqm;");
    System.out.println("The volume of the room is  " + volume(length, width, height) + "sqm;");
    System.out.printf("The cost of carpeting the room is  %.2f ?;\n", carpetCost(length, width, carpetCost));
    System.out.printf("The cost of painting the walls is  %.2f ?;\n", wallPaintCost(length, width, height, paintCost));
    System.out.println("The number of carpet tiles needed is  " + numCarpetTiles(length, width));
  }
}