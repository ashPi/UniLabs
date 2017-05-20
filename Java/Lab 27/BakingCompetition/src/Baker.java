import java.util.*;
/**
 *
 * @author 1600502
 */
public class Baker {
    private String name;
    private String ID;

    public Baker(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    
    public Baker(String ID) {
        this.name = "Not assigned";
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Baker: " + getName() + " - ID Number: " + getID() + '.';
    } 

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
