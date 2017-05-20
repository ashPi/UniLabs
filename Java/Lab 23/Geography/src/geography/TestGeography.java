package geography;
import java.util.*;
/**
 *
 * @author 1600502
 */
public class TestGeography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ArrayList<String> elements = new ArrayList<>(); 
        elements.add("Bulgaria");
        elements.add("Croatia");
        elements.add("Scotland");
        elements.add("Bulgaria");
        elements.add("Scotland");
        elements.add("Scotland");
        elements.add("America");
        GeographyList testList = new GeographyList();
        testList.setCountries(elements);
        System.out.println(testList.toString());
        testList.removeDuplicates();
        System.out.println(testList.toString());
        testList.alphabeticalSort();
        System.out.println(testList.toString());
        testList.removeAndReplace("USA", "Iceland");
        System.out.println(testList.toString());
        testList.reverseSort();
        System.out.println(testList.toString());
    }
    
}
