package io.zipcoder.interfaces;


    public final class Instructors extends People{
        private static Instructors ourInstance = new Instructors();

        public static Instructors getInstance() {
            return ourInstance;
        }

        private Instructors() {
            super.addPerson(new Instructor(1, "Kris"));
            super.addPerson(new Instructor(2, "Froilan"));
            super.addPerson(new Instructor(3, "Roberto"));
            super.addPerson(new Instructor(4, "Chris"));
            super.addPerson(new Instructor(5, "Dolio"));
        }
    }

