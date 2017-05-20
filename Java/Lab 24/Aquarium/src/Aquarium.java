import java.util.*;
/**
 *
 * @author s4et0
 */
public class Aquarium {
    private ArrayList<String> names;
    
    public Aquarium() {
        names = new ArrayList<>();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Aquarium{" + "names=" + names + '}';
    }
    
    public void killFish(String name) {
        for(int i = 0; i < names.size(); i++) {
            if(name.equals(getNames().get(i))) {
                getNames().remove(i);
                break;
            }
        }
    }
    
    public void addFish(String name) {
        getNames().add(name);
    }
    
    public void printFish() {
        for(String name : names) {
            System.out.println(name);
        }
    }
    
    public boolean isThereFish(String fish) {
        boolean thereIs = false;
        for(String name : names) {
            if(name.equals(fish)) {
                thereIs = true;
                break;
            }
        }
        return thereIs;
    }
}
