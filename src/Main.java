import assignment1.LogicsAndNumbersStuff;
import assignment3.TeamMember;
import assignment4.Student;

public class Main {
    public static void main(String[] args) {
        TeamMember lasseNewMember = new TeamMember(1, "Lasse", "Leader");
        Student student = new Student(123, "Lasse Student");
        System.out.println("StudentID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Multiplier: " + student.getMultiplier());
    }
}
