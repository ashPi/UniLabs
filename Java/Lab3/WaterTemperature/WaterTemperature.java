import java.util.Scanner;

public class WaterTemperature 
{
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter temperature: ");
    double degrees = 0;
    if(in.hasNextDouble())
    {
      degrees = in.nextDouble();  
    }
    else 
    {
      System.out.println("");
      System.out.println("Error: invalid input");
      System.exit(1);
    }
    System.out.println("");
    System.out.print("Is is in Celsius or in Fahrenheit (C/F): ");
    String  system = "";
    if(in.hasNext())
    {
      system = in.next();  
    }
    else 
    {
      System.out.println("");
      System.out.println("Error: invalid input");
      System.exit(2);
    }
    System.out.println("");
    System.out.println("Enter altitude: ");
    double altitude = 0;
    if(in.hasNextDouble())
    {
      altitude = in.nextDouble();  
    }
    else 
    {
      System.out.println("");
      System.out.println("Error: invalid input");
      System.exit(1);
    }
    System.out.println("");
    System.out.print("Is is in metres or in feet (m/f): ");
    String measure = "";
    if(in.hasNext())
    {
      measure = in.next();  
    }
    else 
    {
      System.out.println("");
      System.out.println("Error: invalid input");
      System.exit(2);
    }
    System.out.println("");    
    System.out.print("At temperature of " + degrees + system + " and altitude of " + altitude + measure +" water is ");
    double altitudeM;
    final double M_TO_FT = 3.28;
    if(measure.equals("m")) 
    {
      altitudeM = altitude * M_TO_FT;
    }
    else 
    {
      altitudeM = altitude;
    }
    double temperatureC;
    if(system.equals("F")) 
    {
      temperatureC = (degrees * 9) / 5 + 32;
    }
    else 
    {
      temperatureC = degrees;
    }
    int degreesChange = (int)(altitudeM / 300);
    temperatureC+= degreesChange;
    if(temperatureC <= 0) 
    {
      System.out.println("ice");
    }
    else if(temperatureC < 100) 
    {
      System.out.println("liquid");
    }
    else 
    {
      System.out.println("gas");
    }
    in.close();
  }
}