import java.util.*;

class StudentDetails {
    void details() {
        ArrayList<String> studentDetails = new ArrayList<>();
        studentDetails.add("Name: Upinder kaur");
        studentDetails.add("Age: 20");
        studentDetails.add("ID: 2210990927");
        System.out.println("Student Details:");
        for (String detail : studentDetails) {
            System.out.println(detail);
        }
    }
}

class StudentQualifications {
    void qualifications() {
        ArrayList<String> qualifications = new ArrayList<>();
        qualifications.add("Bachelor of Science");
        qualifications.add("C++ Certification");
        System.out.println("\nQualifications:");
        for (String qual : qualifications) {
            System.out.println(qual);
        }
    }
}

public class Upinder_2210990927 {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        StudentQualifications sq = new StudentQualifications();
        
        sd.details();
        sq.qualifications();
    }
}