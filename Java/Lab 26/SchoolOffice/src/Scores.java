import java.util.*;
/**
 *
 * @author s4et0
 */
public class Scores {
    private int[] scores;

    public Scores(int[] scores) {
        this.scores = scores;
    }
    
    public Scores() {
        this.scores = new int[5];
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void amendScore(int index, int newScore) {
        getScores()[index] = newScore;
    }
    
    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < scores.length; i++) {
            output+= scores[i] + " ";
        }
        return "ModuleScores{" + "scores=" + output + '}';
    }
    
    private char toGrade(int score) {
        char grade = ' ';
        if(score < 35) {
            grade = 'F';
        }
        else if(score < 40) {
            grade = 'E';
        }
        else if(score < 50) {
            grade = 'D';
        }
        else if(score < 60) {
            grade = 'C';
        }
        else if(score < 70) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        return grade;
    }
    
    public char[] convertScores() {
        char[] grades = new char[scores.length];
        for(int i = 0; i < grades.length; i++) {
            grades[i] = toGrade(scores[i]);
        }
        return grades;
    }
    
    public int averageScore() {
        int total = 0;
        for(int i = 0; i < scores.length; i++) {
            total+= scores[i];
        }
        return total / scores.length;
    }
    
    public char averageGrade() {
        return toGrade(averageScore());
    }
}
