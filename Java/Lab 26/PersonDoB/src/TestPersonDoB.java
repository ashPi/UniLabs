/**
 *
 * @author s4et0
 */
public class TestPersonDoB {
    public static void main(String[] args) {
        PersonDoB bdays = new PersonDoB();
        bdays.addPerson("Soso", "09061957");
        bdays.addPerson("Svosvo", "23031999");
        bdays.addPerson("Momo", "11061997");
        bdays.addPerson("Vovo", "13041997");
        bdays.addPerson("Eli", "28041997");
        bdays.addPerson("Svosvo1", "23031997");
        System.out.println(bdays.toString());
        //bdays.removePerson("Eli");
        /*System.out.println("For Each Loop Names: ");
        bdays.printNamesForEach();
        System.out.println("\nIterator Names: ");
        bdays.printNamesIterator();
        System.out.println("\nFor Each Loop DoB: ");
        bdays.printDoBsForEach();
        System.out.println("\nIterator DoB: ");
        bdays.printDoBsIterator();
        System.out.println("\nFor Each Loop pairs: ");
        bdays.printPairsForEach();
        System.out.println("\nIterator pairs: ");
        bdays.printPairsIterator();*/
        bdays.addPerson("Johny", "09061897");
        bdays.addPerson("Svosvo2", "23032007");
        System.out.println("\n" + bdays.toString());
        System.out.println("\nSame birthdays");
        bdays.sameBDay();
        //---------------------------------------------------------------------
        System.out.println("Birthday Order: ");
        bdays.bDayOrder();
        //System.out.println("star".substring(0,2));
        //---------------------------------------------------------------------
        System.out.println("Age Order: ");
        bdays.ageOrder();
    }
    
}
