package io.zipcoder.interfaces;


        public class Student extends Person implements Learner {
        private double totalStudyTime;

        public Student(long id, String name) { super(id, name); }

        public void learn(double numberOfHours){
            totalStudyTime = totalStudyTime+numberOfHours;
        }

            @Override
            public void learn(Double numberOfHours) {

            }

            public double getTotalStudyTime(){
            return totalStudyTime;
        }
    }

