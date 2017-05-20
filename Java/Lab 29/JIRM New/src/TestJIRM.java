import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestJIRM {
    public static void main(String[] args) {
        Contestant jim = new Contestant("Jim", 1, 1.23, "Soso");
        System.out.println("Jim: " + jim.toString());
        Contestant ball = new Contestant();
        ball.setAge(2);
        ball.setName("Ball");
        ball.setOwner("Vick");
        ball.setWeight(1.7);
        System.out.println("Ball: " + ball.toString());
        HashSet<Contestant> set = new HashSet<>();
        set.add(jim);
        set.add(ball);
        
        Competition jirm = new Competition(set);
        System.out.println("\n1" + jirm.toString());
        
        Contestant wicked = new Contestant("Wicked", 1, 0.9, "Momo");
        jirm.addContestant(wicked);
        jirm.addContestant(ball);
        System.out.println("\n2" + jirm.toString());
        jirm.removeContestant(ball);
        ArrayList<Contestant> momo = new ArrayList<>();
        momo = jirm.contestantsOf("Momo");
        System.out.println("\nMomo owns: ");
        for (Contestant contestant : momo) {
            System.out.println(contestant.toString());
        }
        System.out.println("Weigh between 1 and 1.5 kg: ");
        momo = jirm.weightList();
        for (Contestant contestant : momo) {
            System.out.println(contestant.toString());
        }
    }
    
}
