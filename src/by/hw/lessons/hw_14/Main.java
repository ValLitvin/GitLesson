    package by.hw.lessons.hw_14;

        public class Main {
                public static void Main (String... args) {
                Patient p1 = new Patient(1, "Антон", "Сидоров", "ОРИ", 28, Gender.MALE);
                Patient p2 = new Patient(2, "Антон", "Сидоров", "ОРИ", 28, Gender.MALE);
                Patient p3 = new Patient(3, "Галина", "Белая", "ОРВИ", 23, Gender.FEMALE);
                Patient p4 = new Patient(4, "Дмитрий", "Васечкин", "Грипп", 48, Gender.MALE);
                Patient p5 = new Patient(3, "Юлия", "Морозова", "ОРВИ", 75, Gender.FEMALE);

                Room maleRoom = new Room(21, RoomType.MALE);
                Room femaleRoom = new Room(26, RoomType.FEMALE);

                maleRoom.addPatient(p1);
                maleRoom.addPatient(p2);
                femaleRoom.addPatient(p3);
                maleRoom.addPatient(p4);
                femaleRoom.addPatient(p5);

                Department department = new Department("Терапевтическое");
                department.addRoom(maleRoom);
                department.addRoom(femaleRoom);

                System.out.println("Мужчин в отделении: " + department.countMales());
                System.out.println("Женщин в отделении: " + department.countFemales());

                System.out.println("------------------------------");

                System.out.println(maleRoom.getPatientsInfo());
                System.out.println(femaleRoom.getPatientsInfo());
            }
        }