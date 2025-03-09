package by.hw.lessons.hw_7;

public class Student {

    public int id;
    public String name;
    public String surname;
    public String faculty;
    public int course;
    public String group;
    public int grade;

    public Student() {
        System.out.println("Конструктор без параметров");
    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + grade);
    }

    public void infoParams(int id, String name, String surname, String faculty, int course, String group, int grade) {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + grade);
    }

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public String currentGroup() {
        return group;
    }

    public void changeGradeAndGroup(int newGrade, String newGroup) {
        this.grade = newGrade;
        this.group = newGroup;
    }

    public Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.grade() > mark) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.grade() > mark) {
                result[index] = student;
                index++;
            }
        }
        return result;
    }
    private int grade() {
        return 0;
    }
}

