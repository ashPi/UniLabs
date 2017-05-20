public class TestEmployeeAccident 
{
  public static void main(String args[]) 
  {
    Employee roger = new Employee("Roger", "McDermott");
    Accident rMD = new Accident(1, roger, "Sprained Ankle", "First Aid");
    System.out.println(rMD.toString());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee john = new Employee();
    john.setFirstName("John");
    john.setLastName("John");
    Accident jI = new Accident(2, john, "Broken Arm", "Visit Casually");
    System.out.println(jI.toString());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee mark = new Employee("Mark", "Zarb");
    Accident mZ = new Accident(3, mark, "", "");
    mZ.setPerson(mark);
    mZ.setDescription("Headache");
    System.out.println("Outcome set: " + mZ.setOutcome("FirstAid"));
    //System.out.println("Outcome set: " + mZ.setOutcome("First Aid"));
    System.out.println(mZ.toString());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee chrisina = new Employee("Chrisina", "Jayne");
    Accident cJ = new Accident(4, chrisina, "Radiation", "Hospital Admission");
    System.out.println("Accident number: " + cJ.getAccidentNumber());
    System.out.println("Employee first name: " + cJ.getPerson().getFirstName());
    System.out.println("Employee second name: " + cJ.getPerson().getLastName());
    System.out.println("Accident: " + cJ.getDescription());
    System.out.println("Outcome: " + cJ.getOutcome());
    System.out.println("Serious?: " + cJ.isSerious());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee jay = new Employee("Jay", "Lytwynenko");
    Accident jL = new Accident(5, jay, "Dislocated Shoulder", "Visit Casually");
    System.out.println(jL.toString());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee audrey = new Employee("Audrey", "Fryer");
    Accident aF = new Accident(6, audrey, "Minor Burns", "First Aid");
    System.out.println(aF.toString());
    System.out.println("---------------------------------------------------");
    //---------------------------------------------------------------------
    Employee ian = new Employee("Ian", "Harris");
    Accident iH = new Accident(7, ian, "Concussion", "Hospital Admission");
    System.out.println(iH.toString());
  }
}