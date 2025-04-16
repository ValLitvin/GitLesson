        package by.hw.lessons.hw_14;

        public class Patient {
            private int id;
            private String firstName;
            private String lastName;
            private String diagnosis;
            private int age;
            private Gender gender;

            public Patient(int id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.diagnosis = diagnosis;
                this.age = age;
                this.gender = gender;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getDiagnosis() {
                return diagnosis;
            }

            public void setDiagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public Gender getGender() {
                return gender;
            }

            public void setGender(Gender gender) {
                this.gender = gender;
            }

            public String toString() {
                return String.format("Пациент %d: %s %s, диагноз: %s, возраст: %d, пол: %s", id, lastName, firstName, diagnosis, age, gender);
            }
        }