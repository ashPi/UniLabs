import java.util.*;
/**
 *
 * @author s4et0
 */
public class TestSchoolOffice {
    public static void main(String[] args) {
        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("test", 1);
        System.out.println(map.toString());
        map.put("tes", 2);
        System.out.println(map.toString());*/
        int[] sc = {50, 60, 75, 20, 99};
        Scores scores = new Scores(sc);
        System.out.println(scores.toString());
        /*for(int i = 0; i < scores.convertScores().length; i++) {
            System.out.print(scores.convertScores()[i] + " ");
            System.out.println("Average score: " + scores.averageScore());
            System.out.println("Average grade: " + scores.averageGrade());    
        }*/
        
        Student sis = new Student("Sisi", "1600502", "09/06/1997");
        System.out.println(sis.toString() + "\n");
        HashMap<Student, Scores> map = new HashMap<>();
        map.put(sis, scores);
        
        //Momo
        Student momo = new Student ("Momo", "1600503", "11/06/19997");
        sc = new int[5];
        sc[0] = 32;
        sc[1] = 49;
        sc[2] = 99;
        sc[3] = 78;
        sc[4] = 53;
        scores = new Scores(sc);
        map.put(momo, scores);
        /*for (Map.Entry<Student, Scores> pair : map.entrySet()) {
            System.out.println(pair.toString() + "\n");
        }*/
        System.out.println(map.size());
        ModuleScores module = new ModuleScores(map);
        
        System.out.println(module.toString());
        for (Map.Entry<String, int[]> temp : module.getAverages().entrySet()) {
            System.out.println(temp.getKey() + " : " + temp.getValue()[0] + ", " + (char)temp.getValue()[1]);
        }
        System.out.println("Average scores for each test: ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Test #" + module.averageTest()[i][0] + ": " + module.averageTest()[i][1]);
        }
        
        for(int i = 0; i < 6; i++) {
            System.out.println("Grade " + module.gradeOccurrence()[i][0] + ": occurs " + module.gradeOccurrence()[i][1] + " times.");
        }
    }
}
