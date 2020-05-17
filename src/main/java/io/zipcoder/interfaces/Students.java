package io.zipcoder.interfaces;


        public final class Students extends People {
        private static Students ourInstance = new Students();

        public static Students getInstance() {
            return ourInstance;
        }

        private Students() {
            super.addPerson(new Student(1, "Aarti"));
            super.addPerson(new Student(2, "April"));
            super.addPerson(new Student(3, "Dave"));
            super.addPerson(new Student(4, "Corey"));
            super.addPerson(new Student(5, "Sandy"));
        }
}
