package by.hw.lessons.hw_13;

import java.util.List;
import java.util.ArrayList;

public class Group {
    private int groupNumber;
    private List<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(double minMark){
        students.removeIf(student -> student.getAverageMark() < minMark);
    }
}