public class TestAuction 
{
  public static void main(String args[]) 
  {
    Person me = new Person("Sissindra");
    Person momo = new Person("Momo");
    
    Bid myBid = new Bid(me, 50);
    Bid momoBid = new Bid(momo, 500);
    Bid myBid2 = new Bid(me, 400);
    Bid myBid3 = new Bid(me, 777);
    Bid momoBid2 = new Bid(momo, 700);
    
    Lot banana = new Lot(7777777, "A single yellow banana of exquisite quality");
    
    System.out.println(banana.toString());
    System.out.println("\nBids:");
    System.out.println("Sissindra`s bid (" + myBid.getValue() + "): " + banana.bidFor(myBid));
    System.out.println("Momo`s bid (" + momoBid.getValue() + "): " + banana.bidFor(momoBid));
    System.out.println(me.getName() + "`s bid: " + banana.bidFor(myBid2));
    System.out.println(myBid3.getBidder() + "`s bid: " + banana.bidFor(myBid3));
    System.out.println(momo.getName() + "`s bid: " + banana.bidFor(momoBid2));
    System.out.println("\nHighest bid for the Banana: " + banana.getHighestBid().getValue());
  }
}