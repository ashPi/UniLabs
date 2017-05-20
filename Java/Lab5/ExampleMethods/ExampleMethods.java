// Examples from lecture 7

public class ExampleMethods {

    // Example 1: No return statement
    public static void sum(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        System.out.println("Sum from " + start + " to " + end + " is " + total);
    }

    // Example 2: returning a value
    public static double rectArea(double length, double breadth) {
        // We could use a local varaible
        //double area = length * breadth;
        return length * breadth;
    }

    // Example 3: Multiple return statements 
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
    
    //Determine the maximum of 2 values;
    public static int max(int a, int b) 
    {
      if (a < b) 
      {
        return b;
      }
      else 
      {
        return a;
      }
    }
    
    //Determine the volume of a cuboid 
    public static double cuboidVolume(double length, double width, double height) 
    {
      if(length <= 0 || width <= 0 || height <= 0) 
      {
        return 0;
      }
      else 
      {
        return length * width * height;
      }
    }
    
    //Determine the average of 3 values
    public static double average(double a, double b, double c) 
    {
      return (a + b + c) / 3;
    }
   
    public static void main(String[] args) {
        /*sum(1,50);
        sum(1,50);
        sum(50,100);
        System.out.printf("Rectangle area is %.2f\n", rectArea(1.2,4.5));
        double squareArea = rectArea(5.6, 5.6);
        System.out.printf("Square area is %.2f m^2\n", squareArea);
        int x = 9;
        int y = -10;
        System.out.println("Min of " + x + " and " + y + " is " + min(x,y));*/
        
      System.out.println("The maximum of 45 and -45 is " + max(45, -45));
      System.out.printf("The volume of a cuboid with length = 3, width = 3 and height = 5.8 is %.2f\n", cuboidVolume(3, 3, 5.8));
      System.out.printf("The volume of a cuboid with length = 3, width = 3 and height = -5.8 is %.2f\n", cuboidVolume(3, 3, -5.8));
      System.out.println("The average of 13, -5.92 and 33 is " + average(13, -5.92, 33));
        
    }
}
