import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        PandaiSdnBhd pandai = new PandaiSdnBhd();
        // Create a sample tuition center 1 with some students and tutors
        TuitionCenter center1 = new TuitionCenter("Maju Tuition", new HeadMaster("Rahman", "650825-14-8974", "Taman Mawar", 15));

        Tutor tutor1 = new Tutor("Dahlia", "620218-14-0943", "Taman Belimbing", "Degree", 3, 2);
        Tutor tutor2 = new Tutor("Adi", "670514-14-0245", "Taman Perdana", "Degree", 4, 3);
        
        List<Integer> scores1 = new ArrayList<>();
        scores1.add(90);
        scores1.add(80);
        scores1.add(70);
        Student student1 = new Student("Susanti", "033456-01-2347", "Taman Putra Permai", 2022, "SMK Seri Serdang", scores1);
        
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(85);
        scores2.add(75);
        scores2.add(65);
        Student student2 = new Student("Mail", "013456-01-2348", "Taman Seri Indah", 2022, "SMK Seri Indah", scores2);
        
        center1.addTutor(tutor1);
        center1.addTutor(tutor2);
        center1.addStudent(student1);
        center1.addStudent(student2);
        pandai.addTuitionCenter(center1);

       // Create a sample tuition center 2 with some students and tutors
        TuitionCenter center2 = new TuitionCenter("New Light Tuition", new HeadMaster("Rara", "650825-14-8974", "Taman Mawar", 18));

        Tutor tut1 = new Tutor("Rose", "670514-14-0245", "Taman Bukit Bukau", "Degree", 3, 2);
        
        List<Integer> scor1 = new ArrayList<>();
        scor1.add(88);
        scor1.add(56);
        scor1.add(72);
        Student stud1 = new Student("Jisoo", "033456-01-2347", "Taman Putra Permai", 2022, "SMK Seri Serdang", scor1);
        
        center2.addTutor(tut1);
        center2.addStudent(stud1);
        pandai.addTuitionCenter(center2);
        
        
        pandai.generateReport();
    }
}
