import java.util.*;
/**
 *
 * @author s4et0
 */
public class Competition {
    private HashSet<Contestant> contestants;

    public Competition(HashSet<Contestant> contestants) {
        this.contestants = new HashSet<>();
        for (Contestant contestant : contestants) {
            this.contestants.add(contestant);
        }
    }
    
    public Competition() {
        this.contestants = new HashSet<>();
    }

    public HashSet<Contestant> getContestants() {
        return contestants;
    }

    public void setContestants(HashSet<Contestant> contestants) {
        this.contestants = contestants;
    }
    
    public void addContestant(Contestant cont) {
        this.contestants.add(cont);
    }
    
    public void removeContestant(Contestant cont) {
        if(contestants.contains(cont)) {
            contestants.remove(cont);
        }
        else {
            System.out.println("There is no such contestant");;
        }
    }
    
    public ArrayList<Contestant> contestantsOf(String owner) {
        ArrayList<Contestant> owned = new ArrayList<>();
        for (Contestant contestant : contestants) {
            if(contestant.getOwner().equals(owner)) {
                owned.add(contestant);
            }
        }
        return owned;
    }
    
    public ArrayList<Contestant> weightList() {
        ArrayList<Contestant> weight = new ArrayList<>();
        for (Contestant contestant : contestants) {
            if(contestant.getWeight() >= 1.0 && contestant.getWeight() <= 1.5) {
                weight.add(contestant);
            }
        }
        return weight;
    }

    @Override
    public String toString() {
        String contents = "Competition:\n";
        for (Contestant contestant : contestants) {
            contents+= contestant.toString() + "\n";
        }
        return contents;
    }
}
