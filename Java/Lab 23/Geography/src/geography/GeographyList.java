package geography;
import java.util.*;

/**
 *
 * @author 1600502
 */
public class GeographyList {

    private ArrayList<String> countries;

    public GeographyList() {
        countries = new ArrayList<>();
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "GeographyList{" + "countries=" + countries + '}';
    }

    public void addCountry(String country) {
        countries.add(country);
    }

    public void removeDuplicates() {
        for (int i = 0; i < countries.size(); i++) {
            for (int j = i + 1; j < countries.size(); j++) {
                if (countries.get(i).equals(countries.get(j))) {
                    countries.remove(j);
                    j--;
                }
            }
        }
    }
    
    public void alphabeticalSort() {
        //Collections.sort(countries);
        for(int i = 0; i < countries.size(); i++) {
            for(int j = i + 1; j < countries.size(); j++) {
                if(countries.get(i).compareTo(countries.get(j)) > 0) {
                    String swap = countries.get(i);
                    countries.set(i, countries.get(j));
                    countries.set(j, swap);
                }
            }
        }
    } 
    
    public void removeAndReplace(String firstEntry, String secondEntry) {
        countries.remove(0);
        countries.remove(countries.size() - 1);
        this.addCountry(firstEntry);
        this.addCountry(secondEntry);
    }
    
    public void reverseSort() {
        for(int i = 0; i < countries.size(); i++) {
            for(int j = i + 1; j < countries.size(); j++) {
                if(countries.get(i).compareTo(countries.get(j)) < 0) {
                    String swap = countries.get(i);
                    countries.set(i, countries.get(j));
                    countries.set(j, swap);
                }
            }
        }
    }
}
