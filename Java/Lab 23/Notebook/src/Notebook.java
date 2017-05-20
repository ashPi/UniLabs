import java.util.*;
/**
 *
 * @author s4et0
 */
public class Notebook {
    private ArrayList<String> notes;

    public Notebook(ArrayList<String> notes) {
        this.notes = new ArrayList<String>();
        for(int i = 0; i < notes.size(); i++) {
            this.notes.set(i, notes.get(i));
        }
    }
    
    public Notebook() {
        this.notes = new ArrayList<String>();
    }
    
    public void addNote(String note) {
        this.notes.add(note);
    }
    
    public void addNote(String note, int index) {
        this.notes.add(index, note);
    }
    
    public void removeNote(int index) {
        if(index >= notes.size() || index < 0) {
            System.out.println("The index you`ve entered is invalid. Please try another one");
        }
        else {
            this.notes.remove(index);
        }
    }

    @Override
    public String toString() {
        return "Notebook{" + "notes=" + notes + '}';
    }
    
    public void listNotes() {
        for(int i = 0; i < notes.size(); i++) {
            System.out.println("Note #" + (i + 1) + ": " + notes.get(i));
        }
    }
    
    public void showNote(int index) {
        if(index >= notes.size() || index < 0) {
            System.out.println("The index you`ve entered is invalid. Please try another one");
        }
        else {
            System.out.println("Note #" + (index + 1) + ": " + notes.get(index));
        }
    }
    
    public void fullSearch(String entry) {
        boolean found = false;
        for (String note : notes) {
            if(note.contains(entry)) {
                System.out.println(note);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Search term not found.");
        }
    }
    
    public void searchForString(String entry) {
        int i = 0;
        boolean found = false;
        while(i < notes.size()) {
            if(notes.get(i).contains(entry)) {
                System.out.println(notes.get(i));
                found = true;
                break;
            }
            i++;
        }
        if(!found) {
            System.out.println("Search term not found.");
        }
    }
}
