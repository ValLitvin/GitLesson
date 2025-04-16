    package by.hw.lessons.hw_14;

    public enum RoomType {
        MALE("Мужской"),
        FEMALE("Женский");

        private final String displayName;

        RoomType(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }

        public Gender toGender() {
            switch (this) {
                case MALE:
                    return Gender.MALE;
                case FEMALE:
                    return Gender.FEMALE;
                default:
                    throw new IllegalArgumentException("Тип платы не определён");
            }
        }
    }