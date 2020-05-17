package io.zipcoder.interfaces;



    public class Instructor extends Person implements Teacher {
        public Instructor(long id, String name) {
            super(id, name);
        }

        public void teach(Learner learn, double numberOfHours) {
            learn.learn(numberOfHours);
        }

        public void lecture(Learner[] learners, double numberOfHours) {
            for (Learner learner : learners) {
                learner.learn(numberOfHours / learners.length);
            }
        }
    }
