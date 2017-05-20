/**
 *
 * @author s4et0
 */
public class FoulPlay {
    private int bookings;
    private int sendingsOff;
    
    public FoulPlay(int bookings, int sendingsOff) {
        this.bookings = bookings;
        this.sendingsOff = sendingsOff;
    }
    
    public FoulPlay() {
        this.bookings = 0;
        this.sendingsOff = 0;
    }
    
    public int getBookings() {
        return bookings;
    }

    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

    public int getSendingsOff() {
        return sendingsOff;
    }

    public void setSendingsOff(int sendingsOff) {
        this.sendingsOff = sendingsOff;
    }
    
    public int getPenaltyPoints() {
        return getBookings() + getSendingsOff() * 2;
    }
    
    @Override
    public String toString() {
        String output = "The player has been booked " + getBookings() + " times; ";
        output += "The player has been sent off " + getSendingsOff() + " times; ";
        return output;
    }
}
