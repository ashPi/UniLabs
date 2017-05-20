import java.util.*;
/**
 *
 * @author s4et0
 */
public class Competition {
    private HashMap<Rabbit, Owner> rabbits;
    private HashMap<GuineaPig, Owner> pigs;
    
    public Competition(HashMap<Contestant, Owner> contestants) {
        this.rabbits = new HashMap<>();
        this.pigs = new HashMap<>();
        for (Map.Entry<Contestant, Owner> pair : contestants.entrySet()) {
            if(pair.getKey().getClass().getName().equals("Rabbit")) {
                this.rabbits.put((Rabbit)pair.getKey(), pair.getValue());
            }
            else {
                this.pigs.put((GuineaPig)pair.getKey(), pair.getValue());
            }
        }
    }
    
    public Competition() {
        this.rabbits = new HashMap<>();
        this.pigs = new HashMap<>();
    }
    
    public Competition(HashMap<Rabbit, Owner> rabbits, HashMap<GuineaPig, Owner> pigs) {
        this.rabbits = new HashMap<>();
        this.rabbits = (HashMap<Rabbit, Owner>) rabbits.clone();
        this.pigs = (HashMap<GuineaPig, Owner>) pigs.clone();
    }
    
    public void addRabbit(Owner owner, Rabbit cont) {
        this.getRabbits().put(cont, owner);
    }
    
    public void addGuineaPig(Owner owner, GuineaPig pig) {
        this.getPigs().put(pig, owner);
    }
    
    public void removeContestant(Contestant cont) {
        if(getRabbits().containsKey(cont)) {
            getRabbits().remove(cont);
        }
        else if(getPigs().containsKey(cont)) {
            getPigs().remove(cont);
        }
        else {
            System.out.println("There is no such contestant.");
        }
    }
    
    public ArrayList<Contestant> contestantsOf(Owner owner) {
        ArrayList<Contestant> owned = new ArrayList<>();
        for (Map.Entry<Rabbit, Owner> pair : getRabbits().entrySet()) {
            if(pair.getValue().equals(owner)) {
                owned.add(pair.getKey());
            }
        }
        for (Map.Entry<GuineaPig, Owner> pair : getPigs().entrySet()) {
            if(pair.getValue().equals(owner)) {
                owned.add(pair.getKey());
            }
        }
        return owned;
    }
    
    public ArrayList<Contestant> weightList() {
        ArrayList<Contestant> weight = new ArrayList<>();
        for (Rabbit rabbit : getRabbits().keySet()) {
            if(rabbit.getWeight() >= 1.0 && rabbit.getWeight() <= 1.5) {
                weight.add(rabbit);
            }
        }
        for (GuineaPig pig : getPigs().keySet()) {
            if(pig.getWeight() >= 1.0 && pig.getWeight() <= 1.5) {
                weight.add(pig);
            }
        }
        return weight;
    }

    @Override
    public String toString() {
        String contents = "COMPETITION:\n\nRabbits:\n";
        for (Map.Entry<Rabbit, Owner> pair : getRabbits().entrySet()) {
            contents+= pair.getKey().toString() + "\n";
            contents+= pair.getValue().toString() + "\n\n";
        }
        contents+="\nGuineaPigs:\n";
        for (Map.Entry<GuineaPig, Owner> pair : getPigs().entrySet()) {
            contents+= pair.getKey().toString() + "\n";
            contents+= pair.getValue().toString() + "\n\n";
        }
        return contents;
    }

    public HashMap<Rabbit, Owner> getRabbits() {
        return rabbits;
    }

    public void setRabbits(HashMap<Rabbit, Owner> rabbits) {
        this.rabbits = rabbits;
    }

    public HashMap<GuineaPig, Owner> getPigs() {
        return pigs;
    }

    public void setPigs(HashMap<GuineaPig, Owner> pigs) {
        this.pigs = pigs;
    }
}
