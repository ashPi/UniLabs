import java.util.*;
/**
 *
 * @author s4et0
 */
public class ModuleScores {
    private HashMap<Student, Scores> moduleScores;

    public ModuleScores(HashMap<Student, Scores> modulScores) {
        this.moduleScores = new HashMap<>();
        for (Map.Entry<Student, Scores> entryPair : modulScores.entrySet()) {
            this.moduleScores.put(entryPair.getKey(), entryPair.getValue());
        }
    }
    
    public ModuleScores() {
        this.moduleScores = new HashMap<>();
    }

    public HashMap<Student, Scores> getModuleScores() {
        return moduleScores;
    }

    public void setModuleScores(HashMap<Student, Scores> moduleScores) {
        this.moduleScores = moduleScores;
    }

    @Override
    public String toString() {
        String output = "";
        Iterator it = moduleScores.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Student, Scores> temp = (Map.Entry)it.next();
            output+= temp.getKey().getName() + " : " + temp.getValue().toString() + "\n";
        }
        return output;
    }
    
    public int[] getScoresOf(Student student) {
        return moduleScores.get(student).getScores();
    }
    
    public HashMap<String, int[]> getAverages() {
        HashMap<String, int[]> temp = new HashMap<>();
        for (Map.Entry<Student, Scores> entryPair : moduleScores.entrySet()) {
            int[] avg = {entryPair.getValue().averageScore(), entryPair.getValue().averageGrade()};
            temp.put(entryPair.getKey().getName(), avg);
        }
        return temp;
    }
    public int[][] averageTest() {
        int[][] avg = new int[5][2];
        for(int i = 0; i < 5; i++) {
            avg[i][0] = i + 1;
            avg[i][1] = 0;
            for (Scores entries : moduleScores.values()) {
                avg[i][1] += entries.getScores()[i];
            }
            avg[i][1] = avg[i][1] / moduleScores.size();
        }
        return avg;
    }
    
    public String[][] gradeOccurrence() {
        String[][] grades = new String[6][2];
        for(int i = 0; i < 6; i++) {
            grades[i][0] = Character.toString((char) (i + 65));
            grades[i][1] = "" + 0;
        }
        for (Scores value : moduleScores.values()) {
            for(int i = 0; i < 5; i++) {
                switch(value.convertScores()[i]) {
                    case 'A': grades[0][1] = "" + (Integer.parseInt(grades[0][1]) + 1); break;
                    case 'B': grades[1][1] = "" + (Integer.parseInt(grades[1][1]) + 1); break;
                    case 'C': grades[2][1] = "" + (Integer.parseInt(grades[2][1]) + 1); break;
                    case 'D': grades[3][1] = "" + (Integer.parseInt(grades[3][1]) + 1); break;
                    case 'E': grades[4][1] = "" + (Integer.parseInt(grades[4][1]) + 1); break;
                    case 'F': grades[5][1] = "" + (Integer.parseInt(grades[5][1]) + 1); break;
                }
            }
        }
        return grades;
    }
}
