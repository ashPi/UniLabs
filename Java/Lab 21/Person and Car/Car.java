public class Car 
{
  //--------------------Fields-----------------------------------
  
  private Person owner;
  private String make;
  private double mileage;
  private boolean isPetrol;
  
  //--------------------Contructor-----------------------------------
  
  public Car() 
  {
    owner = new Person();
    make = "Not specified";
    mileage = 0;
    isPetrol = true;
  }
  
  public Car(Person anOwner, String aMake, double aMileage, boolean petrol) 
  {
    owner = new Person();
    owner.setFirstName(anOwner.getFirstName());
    owner.setLastName(anOwner.getLastName());
    owner.setAge(anOwner.getAge());
    owner.setInsurance(anOwner.getInsurance());
    make = aMake;
    mileage = aMileage;
    isPetrol = petrol;
  }
  //--------------------Setter Methods-----------------------------------
  
  public void setOwner(Person anOwner) 
  {
    owner = anOwner;
  }
  
  public void setMake(String aMake) 
  {
    make = aMake;
  }
  
  public void setMileage(double aMileage) 
  {
    mileage = aMileage;
  }
  
  public void setPetrol(Boolean petrol) 
  {
    isPetrol = petrol;
  }
  
  //--------------------Getter Methods-----------------------------------
  
  public Person getOwner() 
  {
    return owner;
  }
  
  public String getMake() 
  {
    return make;
  }
  
  public double getMileage() 
  {
    return mileage;
  }
  
  public boolean getPetrol() 
  {
    return isPetrol;
  }
  
  //--------------------Other Methods-----------------------------------
  
  public String mileageClass() 
  {
    String classification = "";
    if(getMileage() < 20000) 
    {
      classification = "low";
    }
    else if(getMileage() < 50000) 
    {
      classification = "medium";
    }
    else 
    {
      classification = "high";
    }
    return classification;
  }
  
  public void displayWarning() 
  {
    if(mileageClass() == "high") 
    {
      System.out.println("The mileage of the car exceeds 50 000");
    }
  }
  
  public String replacementNeeded() 
  {
    String replacement = "No replacement needed yet";
    if(getPetrol() && getMileage() > 75000) 
    {
      replacement = "spark plugs";
    }
    if(getPetrol()== false && getMileage() > 100000) 
    {
      replacement = "compressor valve";
    }
    return replacement;
  }
  
  public String toString() 
  {
    String contents = owner.toString();
    contents+= "\nMake: " + getMake();
    contents+= "\nMileage: " + getMileage();
    contents+= "\nMileage class";
    if(getPetrol()) 
    {
      contents+= "\nPetrol";
    }
    else 
    {
      contents+= "\nDiesel";
    }
    contents+= "\nReplacement needed: " + replacementNeeded();
    
    return contents;
  }
}