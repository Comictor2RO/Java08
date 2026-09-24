package ex01;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Student {
    private int id;
    private List<String> courses = new ArrayList<>();
    private Set<String> clubs = new HashSet<>();

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void joinClub(String club) {
        clubs.add(club);
    }
}
