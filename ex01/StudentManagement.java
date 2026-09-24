package ex01;

import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void enrollInCourse(int studentId, String course) {
        Student student = students.get(studentId);

        if (student != null) {
            student.addCourse(course);
        }
    }

    public void joinClub(int studentId, String club) {
        Student student = students.get(studentId);

        if (student != null) {
            student.joinClub(club);
        }
    }
}
