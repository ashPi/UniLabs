public class SphereCylinderCone 
{
  public static double sphereVolume(double r) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      return (4 * Math.PI * Math.pow(r, 3)) /3;
    }
  }
  
  public static double sphereSurface(double r) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      return Math.PI * Math.pow(r, 2);
    }
  }
  
  public static double cylinderVolume(double r, double h) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      return Math.PI * Math.pow(r, 2) * h;
    }
  }
  
  public static double cylinderSurface(double r, double h) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      return 2 * (Math.PI * Math.pow(r, 2) + Math.PI * r * h);
    }
  }
  
  public static double coneVolume(double r, double h) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      return (Math.PI * Math.pow(r, 2) * h) / 3;
    }
  }
  
  public static double coneSurface(double r, double h) 
  {
    if(r <= 0) 
    {
      return 0;
    }
    else 
    {
      double l = Math.sqrt(r * r + h * h );
      return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }
  }
  
  public static void main (String[] args) 
  {
    System.out.printf("The volume of a sphere with radius 4.6 is %.2f\n", sphereVolume(4.6));
    System.out.printf("The volume of a sphere with radius 4.6 is %.2f\n", sphereSurface(4.6));
    System.out.printf("The volume of a cylinder with radius 4.6 and height 5 is %.2f\n", cylinderVolume(4.6, 5));
    System.out.printf("The volume of a cylinder with radius 5 and height 4.6 is %.2f\n", cylinderVolume(5, 4.6));
    System.out.printf("The volume of a cone with radius 13 and height 5.8 is %.2f\n", coneVolume(13, 5.8));
    System.out.printf("The volume of a cone with radius 7 and height -5.8 is %.2f\n", coneVolume(7, -5.8));
    System.out.printf("The volume of a sphere with radius -4.6 is %.2f\n", sphereVolume(-4.6));
  }
}