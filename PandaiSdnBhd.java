  import java.util.ArrayList;
    import java.util.List;
    public class PandaiSdnBhd {

    private List<TuitionCenter> tuitionCenter;

    public PandaiSdnBhd() {
        tuitionCenter = new ArrayList<>();
    }

    public void addTuitionCenter(TuitionCenter center) {
        tuitionCenter.add(center);
    }

    public void removeTuitionCenter(TuitionCenter center) {
        tuitionCenter.remove(center);
    }

    public List<TuitionCenter> getTuitionCenter() {
        return tuitionCenter;
    }

    public void generateReport() {
        // Generate a report on the performance of each center
        for (TuitionCenter center : tuitionCenter) {
            double averageMarks = center.getAverageMarks();
            double minMarks = center.getMinMarks();
            double maxMarks = center.getMaxMarks();
            
            System.out.println("Tuition Center Report:");
            System.out.println("Center: " + center.getAddress());
            System.out.println("#Students: " + center.getStudents().size());
            System.out.println("#Tutors: " + center.getTutors().size());
            
                // Calculate avg, min, max scores for the students
            System.out.println("Average Marks for " + center.getStudents().size() + " students: " + averageMarks);
            System.out.println("Minimum Marks for " + center.getStudents().size() + " students: "  + minMarks);
            System.out.println("Maximum Marks for " + center.getStudents().size() + " students: " + maxMarks);
            
                        // Show the background of the tutors
            System.out.println("Tutors' Background: ");
            ArrayList<Tutor> tutors = center.getTutors();
            for (Tutor tutor : tutors) {
            System.out.println("- " + tutor.getName() + " (" + tutor.getQualification() + "," + tutor.getYearsOfExperience() + " years of experiences)");}
        
                 //This will retrieve line separator 
            String newLine = System.getProperty("line.separator"); 
            System.out.println ( newLine );

        }
    }
    }
