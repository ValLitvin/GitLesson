    package by.hw.lessons.hw_14;

    import java.util.HashSet;
    import java.util.Set;

    public class Department {
        private final String name;
        private final Set<Room> rooms = new HashSet<>();

        public Department(String name) {
            this.name = name;
        }

        public void addRoom(Room room) {
            rooms.add(room);
        }

        public int countMales() {
            return (int) rooms.stream()
                    .flatMap(r -> r.getPatients().stream())
                    .filter(p -> p != null && p.getGender() == Gender.MALE)
                    .count();
        }

        public int countFemales() {
            return (int) rooms.stream()
                    .flatMap(r -> r.getPatients().stream())
                    .filter(p -> p.getGender() == Gender.FEMALE)
                    .count();
        }
    }