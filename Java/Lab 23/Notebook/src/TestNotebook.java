/**
 *
 * @author s4et0
 */
public class TestNotebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notebook myBook = new Notebook();
        myBook.addNote("Why am I doing this");
        myBook.addNote("I am so dedicated");
        myBook.addNote("Lauren bought flowers because she killed her cat", 1);
        System.out.println(myBook.toString());
        myBook.addNote("Bobby wants to be a serial killer when he grows up",3);
        myBook.addNote("Kate fed dog biscuits to her son");
        myBook.listNotes();
        myBook.removeNote(1);
        System.out.println("remove()");
        System.out.println(myBook.toString());
        myBook.showNote(4);
        System.out.println("show4");
        myBook.showNote(3);
        System.out.println("show3");
        System.out.println();
        System.out.println();
        myBook.searchForString("am");
        System.out.println("search(am)");
        myBook.fullSearch("I ");
        System.out.println("search (I)");
        myBook.fullSearch("grass");
        System.out.println("searched(grass)");
        myBook.searchForString("Laren");
        System.out.println("searched(Laren)");
    }
    
}
