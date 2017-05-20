
import java.util.*;

/**
 *
 * @author s4et0
 */
public class PersonDoB {

    private HashMap<String, String> DoBs;

    public PersonDoB() {
        this.DoBs = new HashMap<>();
    }

    public HashMap<String, String> getDoBs() {
        return DoBs;
    }

    public void setDoBs(HashMap<String, String> DoBs) {
        this.DoBs = DoBs;
    }

    @Override
    public String toString() {
        return "PersonDoB{" + "DoBs=" + DoBs + '}';
    }

    public void addPerson(String person, String Dob) {
        DoBs.put(person, Dob);
    }

    public void removePerson(String person) {
        DoBs.remove(person);
    }

    public void printNamesForEach() {
        for (String person : DoBs.keySet()) {
            System.out.println(person);
        }
    }

    public void printNamesIterator() {
        Iterator personIt = DoBs.keySet().iterator();
        while (personIt.hasNext()) {
            System.out.println(personIt.next());
        }
    }

    public void printDoBsForEach() {
        for (String person : DoBs.values()) {
            System.out.println(person);
        }
    }

    public void printDoBsIterator() {
        Iterator DoBIt = DoBs.values().iterator();
        while (DoBIt.hasNext()) {
            System.out.println(DoBIt.next());
        }
    }

    public void printPairsForEach() {
        for (Map.Entry<String, String> pair : DoBs.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public void printPairsIterator() {
        Iterator pairIt = DoBs.entrySet().iterator();
        while (pairIt.hasNext()) {
            Map.Entry pair = (Map.Entry) pairIt.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public boolean sameBDay() {
        boolean same = false;
        HashSet<ArrayList> sameDoB = new HashSet<>();
        //int i = 0;
        for (String DoB : DoBs.values()) {
            ArrayList<String> sameDoBEntries = new ArrayList<String>();
            //System.out.println(i + " Dob" + DoB);
            for (Map.Entry<String, String> pair : DoBs.entrySet()) {
                if (DoB.equals(pair.getValue())) {
                    sameDoBEntries.add(pair.getKey());
                }
            }
            //System.out.println(i + " " + names.toString());
            if (sameDoBEntries.size() > 1) {
                same = true;
                //ArrayList<String> temp = new ArrayList<>();

                //System.out.println("toString(): " + sameDoBEntries.toString());
                sameDoB.add(sameDoBEntries);
                //System.out.println("DoB toString(): " + sameDoB.toString());
                /*System.out.print(DoB + ": " );
                 //iterator.remove();
                 for (String name : sameDoBEntries) {
                    System.out.print(name + " ");
                    //copyMap.remove(name);
                }
                 System.out.println("");*/
            }
            //sameDoBEntries.clear();
            //System.out.println(i + " " + copyMap.toString());
            //i++;
        }
        System.out.println("Is empty: " + sameDoB.isEmpty());
        System.out.println("To String: " + sameDoB.toString());
        if (same) {
            for (ArrayList list : sameDoB) {
                //System.out.println("Type: " + list.size());
                //System.out.println("Type: " + list.get(0).getClass());
                String key = list.get(0).toString();
                //Object key = list.get(0);
                //System.out.println("TEst: [" + key + "]" + DoBs.containsKey(key));
                System.out.print(DoBs.get(key) + ": ");
                for (Object object : list) {
                    System.out.print(object + ", ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("There are no people sharing the same DoB.");
        }
        return same;
    }

    public void bDayOrder() {
        ArrayList<String[]> entries = new ArrayList<>();
        for (Map.Entry<String, String> pair : DoBs.entrySet()) {
            String[] temp = new String[3];
            temp[1] = pair.getValue().substring(0, 2);
            temp[0] = pair.getValue().substring(2, 4);
            temp[2] = pair.getKey();
            //System.out.println(temp.toString());
            entries.add(temp);
        }
        for (int i = 0; i < entries.size(); i++) {
            for (int j = i + 1; j < entries.size(); j++) {
                if (Integer.parseInt(entries.get(i)[0]) == Integer.parseInt(entries.get(j)[0])) {
                    if (Integer.parseInt(entries.get(i)[1]) > Integer.parseInt(entries.get(j)[1])) {
                        String[] temp = new String[3];
                        temp[0] = entries.get(i)[0];
                        temp[1] = entries.get(i)[1];
                        temp[2] = entries.get(i)[2];
                        entries.set(i, entries.get(j));
                        entries.set(j, temp);
                    }
                } else if (Integer.parseInt(entries.get(i)[0]) > Integer.parseInt(entries.get(j)[0])) {
                    String[] temp = new String[3];
                    temp[0] = entries.get(i)[0];
                    temp[1] = entries.get(i)[1];
                    temp[2] = entries.get(i)[2];
                    entries.set(i, entries.get(j));
                    entries.set(j, temp);
                }//end of else
            }//end of inner loop
        }//end of outer loop
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i)[2] + " : " + DoBs.get(entries.get(i)[2]).substring(0, 2) + "/" + DoBs.get(entries.get(i)[2]).substring(2, 4) + "/" + DoBs.get(entries.get(i)[2]).substring(4));
        }
    }

    public void ageOrder() {
        ArrayList<String[]> entries = new ArrayList<>();

        for (Map.Entry<String, String> date : DoBs.entrySet()) {
            String[] temp = new String[2];
            temp[0] = date.getValue().substring(4);
            temp[1] = date.getKey();
            entries.add(temp);
        }
        for (int i = 0; i < entries.size(); i++) {
            for (int j = i + 1; j < entries.size(); j++) {
                if (Integer.parseInt(entries.get(i)[0]) > Integer.parseInt(entries.get(j)[0])) {
                    String[] temp = new String[2];
                    temp[0] = entries.get(i)[0];
                    temp[1] = entries.get(i)[1];
                    entries.set(i, entries.get(j));
                    entries.set(j, temp);
                }//end of if
            }//end of inner loop
        }//end of outer loop
        for(int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i)[1] + " : " + DoBs.get(entries.get(i)[1]).substring(0, 2) + "/" + DoBs.get(entries.get(i)[1]).substring(2, 4) + "/" + DoBs.get(entries.get(i)[1]).substring(4));
            //System.out.println(entries.get(i)[1] + " : " + DoBs.get(entries.get(i)[1]));
            //System.out.println(entries.get(i)[1]);
        }
    }
}
