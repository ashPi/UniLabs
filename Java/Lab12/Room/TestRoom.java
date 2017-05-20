/**
 * A Test Class for the Room class
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class TestRoom 
{
  public static void main(String[] args) 
  {
    //Create an instance of the Room class
    //with number 421
    //length 15.6
    //breadth 20.5
    //height 3
    //number of occupants 33
    Room myRoom = new Room(421, 15.6, 20.5, 3, 33);
    
    //Test the get methods 
    System.out.println("Room number: " + myRoom.getNumber());
    System.out.println("Room length: " + myRoom.getLength());
    System.out.println("Room breadth: " + myRoom.getBreadth());
    System.out.println("Room height: " + myRoom.getHeight());
    System.out.println("Number of occupants: " + myRoom.getOccupants());
    
    //Test the calculating methods
    System.out.println("Volume of the room: " + myRoom.calculateVolume());
    System.out.println("Room floor space: " + myRoom.calculateFloorSpace());
    System.out.println("Floor space/occupant: " + myRoom.occupantFloorSpace());
    
    //Test the set methods
    myRoom.setNumber(533);
    myRoom.setLength(20.1);
    myRoom.setBreadth(24);
    myRoom.setHeight(5);
    myRoom.setOccupants(56);
    
    //Test the toString() method
    System.out.println(myRoom.toString());
    
    // Calculating carpeting cost
    
    myRoom.setLength(4.7);
    myRoom.setBreadth(3.4);
    System.out.println("The cost of carpeting a room with length " + myRoom.getLength() + "m and breadth " + myRoom.getBreadth() + "m at 13.99 per sq.m is " + myRoom.calculateFloorSpace() * 13.99);
    
  }
}