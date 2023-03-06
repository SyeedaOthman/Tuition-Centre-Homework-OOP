import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String IC;
    private String address;
    private int year;
    private String schoolName;
    private List<Integer> scores;
    private List<Integer> scor;

    public Student(String name, String IC, String address, int year, String schoolName, List<Integer> scores) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }
    
    public List<Integer> getScores() {
        return scores;
    }
    
    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }
    
    
       public String getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
