/**
 *
 * @author s4et0
 */
public class TestAquarium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aquarium bubbleland = new Aquarium();
        bubbleland.addFish("Da perky swimmer");
        bubbleland.addFish("Kraken");
        bubbleland.addFish("Soviet submarine");
        bubbleland.addFish("Titanic");
        bubbleland.addFish("Bamby underwater");
        System.out.println(bubbleland.toString());
        System.out.println("Titanic is in the aquarium: " + bubbleland.isThereFish("Titanic"));
        System.out.println("Drunk Ariel is in the aquarium: " + bubbleland.isThereFish("Drunk Ariel"));
        System.out.println("Sadly, Kraken passed away... The aquarium now has only: ");
        bubbleland.killFish("Kraken");
        bubbleland.printFish();
        
    }
    
}
