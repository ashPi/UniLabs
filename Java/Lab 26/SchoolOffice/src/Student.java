/**
 *
 * @author s4et0
 */
public class Student {
    private String name;
    private String matriculationNum;
    private String DoB;
    //private Scores scores;

    public Student(String name, String matriculationNum, String DoB) {
        this.name = name;
        this.matriculationNum = matriculationNum;
        this.DoB = DoB;
        //this.scores = new Scores(scores.getScores());
    }
    
    public Student() {
        this.name = "not assigned";
        this.matriculationNum = "not assigned";
        this.DoB = "not assigned";
        //this.scores = new Scores();
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", matriculationNum=" + matriculationNum + ", DoB=" + DoB + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatriculationNum() {
        return matriculationNum;
    }

    public void setMatriculationNum(String matriculationNum) {
        this.matriculationNum = matriculationNum;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    /*public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores.setScores(scores.getScores());
    }*/
    
}
