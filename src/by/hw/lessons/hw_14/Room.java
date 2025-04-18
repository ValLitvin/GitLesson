    package by.hw.lessons.hw_14;

    import java.util.ArrayList;
    import java.util.List;

    public class Room {
        private final int number;
        private final RoomType roomType;
        private final List<Patient> patients = new ArrayList<>();

        public Room(int number, RoomType roomType) {
            this.number = number;
            this.roomType = roomType;
        }

        public boolean addPatient(Patient patient) {
                    if (patient.getGender() != this.roomType.toGender()) {
                return false;
            }

            if (patients.size() < 3
                    && (patients.isEmpty()
                    || patients.get(0).getDiagnosis().equals(patient.getDiagnosis()))) {
                patients.add(patient);
                return true;
            }
            return false;
        }

        public List<Patient> getPatients() {
            return patients;
        }

        public String getPatientsInfo() {
            StringBuilder sb = new StringBuilder();
            sb.append("Палата №").append(number).append(" (").append(roomType).append("):\n");
            for (Patient p : patients) {
                sb.append(" - ").append(p).append("\n");
            }
            return sb.toString();
        }
    }