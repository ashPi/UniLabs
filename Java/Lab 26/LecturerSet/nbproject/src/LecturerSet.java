import java.util.*;
/**
 *
 * @author 1600502
 */
public class LecturerSet {
    private HashSet<String> names;

    public LecturerSet() {
        this.names = new HashSet<>();
    }

    public HashSet<String> getNames() {
        return names;
    }

    public void setNames(HashSet<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "LecturerSet{" + "names=" + names + '}';
    }
    
    public void addName(String name) {
        if(!names.contains(name)) {
            names.add(name);
            System.out.println("The name " + name + " was successfully added to the set!");
        }
        else {
            System.out.println("The name " + name + " already exists in the set!");
        }
        /*System.out.println(name.contains(name));
        names.add(name);*/
    }
    
    public void printForEach() {
        for (String name : names) {
            System.out.println(name);
        }
    }
    
    public void printIterator() {
        Iterator<String> namesIt = names.iterator();
        while(namesIt.hasNext()) {
            System.out.println(namesIt.next());
        }
    }
}
