import java.util.Scanner;
public class TemperatureRepresentation 
{
  public static int colorForValue(int color1, int color2, int lowerTemperature, int higherTemperature, double temperature) 
  {
    int z = ((int)temperature - lowerTemperature) / (higherTemperature - lowerTemperature);
    return color1 * (1 - z) + color2 * z;
  }
  
  public static int temperature0To25(double temperature) 
  {
    int color1 = interpolate(0, 0, 225);
    int color2 = interpolate(0, 225, 225);
    int color = colorForValue(color1, color2, 0, 25, temperature);
    return color;
  }
    
  public static int temperature25To50(double temperature) 
  {
    int color1 = interpolate(0, 225, 225);
    int color2 = interpolate(0, 225, 0);
    int color = colorForValue(color1, color2, 25, 50, temperature);
    return color;
  }
    
  public static int temperature50To75(double temperature) 
  {
    int color1 = interpolate(0, 225, 0);
    int color2 = interpolate(225, 225, 0);
    int color = colorForValue(color1, color2, 50, 75, temperature);
    return color;
  }
  
  public static int temperature75To100(double temperature) 
  {
    int color1 = interpolate(225, 225, 0);
    int color2 = interpolate(225, 0, 0);
    int color = colorForValue(color1, color2, 75, 100, temperature);
    return color;
  }
  
  public static int interpolate(int red, int green, int blue) 
  {
    return 65536 * red + 256 * green + blue;
  }
  
  
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    double temperature;
    do 
    {
      System.out.print("Enter temperature (0 to 100): ");
      temperature = in.nextDouble();
      System.out.println("");
    }
    while(temperature < 0 || temperature > 100);
    int color;
    if(temperature <= 25) 
    {
      color = temperature0To25(temperature);
    }
    else if(temperature <= 50) 
    {
      color = temperature25To50(temperature);
    }
    else if(temperature <= 75) 
    {
      color = temperature50To75(temperature);
    }
    else
    {
      color = temperature75To100(temperature);
    }
    System.out.println("\nThe color for the given temperature is " + color);
    in.close();
  }
}