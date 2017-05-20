import java.util.Scanner;
public class VolumeOfCone 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Height of the cone: ");
    double height = in.nextDouble();
    System.out.println("");
    System.out.print("Base radius of the cone: ");
    double radius = in.nextDouble();
    System.out.println("");
    double volume = (Math.PI * radius * radius * height)/3;
    System.out.printf("The volume of the cone is %.3f", volume);
    in.close();
  }
}