/**
 * A class that models an auction bid.
 * It contains a reference to the Person bidding and the amount bid.
 * 
 * @author rm
 * @version 2017-03-10
 */
public class Bid
{
    // The person making the bid.
    private final Person bidder;
    // The value of the bid. 
    private final int value;

    /**
     * Create a bid.
     * @param bidder Who is bidding for the lot.
     * @param value The value of the bid.
     */
    public Bid(Person bidder, int value)
    {
        this.bidder = bidder;
        this.value = value;
    }

    /**
     * @return The bidder.
     */
    public Person getBidder()
    {
        return bidder;
    }

    /**
     * @return The value of the bid.
     */
    public int getValue()
    {
        return value;
    }
}