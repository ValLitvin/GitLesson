package by.hw.lessons.hw_7;

public class Main {
    public static void main() {
        int[] array = new int[7];
        Student student0 = new Student();
        student0.id = 1;
        student0.name = "Вадим";
        student0.surname = "Печкин";
        student0.faculty = "Филологический";
        student0.course = 1;
        student0.group = "Ф 01-25";
        student0.grade = 8;
        student0.info();
        System.out.println("---------------");
        Student student1 = new Student();
        student1.id = 2;
        student1.name = "Акакий";
        student1.surname = "Волков";
        student1.faculty = "Математический";
        student1.course = 2;
        student1.group = "М 02-25";
        student1.grade = 7;
        student1.info();
        System.out.println("---------------");
        Student student2 = new Student();
        student2.id = 3;
        student2.name = "Владимир";
        student2.surname = "Петров";
        student2.faculty = "Экономический";
        student2.course = 3;
        student2.group = "Э 02-25";
        student2.grade = 10;
        student2.info();
        System.out.println("---------------");

        Student[] students = new Student[5];
        students[0] = new Student(1, "Вадим", "Сидорова", "Психологический", 2, "П-02/25", 4);
        students[1] = new Student(2, "Дарья", "Кнышевич", "Экономический", 1, "Э-01/25", 5);
        students[2] = new Student(3, "Тимофей", "Павлов", "Юридический", 3, "Ю-03/25", 3);
        students[3] = new Student(4, "Попова", "Екатерина", "Архитектурный", 4, "АРХ-04/25", 5);
        students[4] = new Student(5, "Дмитрий", "Кузнецов", "Биологический", 2, "Б-02/25", 4);

        Student[] goodStudents = students[0].getStudents(students, 4);
        System.out.println("Студенты с оценкой выше 4:");
        for (Student student : goodStudents) {
            student.info();
        }
        System.out.println("---------------");
        students[0].info(); // Вывод информации о первом студенте
        students[0].changeGroup("П-02/25"); // Изменение группы первого студента
        System.out.println("Новая группа первого студента: " + students[0].currentGroup());
        students[0].changeGradeAndGroup(5, "П-03/25"); // Изменение оценки и группы первого студента
        students[0].info();
    }


}