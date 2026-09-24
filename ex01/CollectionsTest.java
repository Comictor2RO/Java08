package ex01;

public class CollectionsTest {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        Student student = new Student(1);
        management.addStudent(student);

        management.enrollInCourse(1, "Java");
        management.joinClub(1, "Programare");
    }
}
