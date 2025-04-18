package by.hw.lessons.hw_13;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Акакий", "Сидоров", LocalDate.of(1999, 05, 7), "Смолевичи", 4.8);
        Student s2 = new Student("Добрыня", "Иванов", LocalDate.of(1996, 11, 23), "Минск", 5.2);
        Student s3 = new Student("Козлова", "Екатерина", LocalDate.of(1997, 02, 15), "Полоцк", 3.3);

        Group g1 = new Group(101);
        Group g2 = new Group(102);
        Group g3 = new Group(103);

        g1.addStudent(s1);
        g2.addStudent(s2);
        g3.addStudent(s3);

        Faculty f1 = new Faculty("Психология 101");
        Faculty f2 = new Faculty("Психология 102");
        Faculty f3 = new Faculty("Психология 103");

        f1.addGroup(g1);
        f2.addGroup(g2);
        f3.addGroup(g3);

        g1.removeStudentsByMark(4.0);
        g2.removeStudentsByMark(4.0);
        g3.removeStudentsByMark(4.0);
    }
}