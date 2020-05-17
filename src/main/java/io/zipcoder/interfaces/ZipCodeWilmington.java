package io.zipcoder.interfaces;




    import java.util.HashMap;
import java.util.Map;

        class ZipCodeWilmington {
        private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();
        private static Students students = Students.getInstance();
        private static Instructors instructors = Instructors.getInstance();

        public static ZipCodeWilmington getInstance() {
            return ourInstance;
        }

        ZipCodeWilmington() {

        }

        public void hostLecture(Teacher teacher, double numberOfHours){
            Learner[] dudes = new Learner[students.personCount()];
            int i = 0;
            for (Object student : students){
                dudes[i] = (Learner) student;
                i++;
            }
            teacher.lecture(dudes,numberOfHours);
        }

        public void hostLecture(long id, double numberOfHours){
            Instructor teacher = (Instructor)instructors.findById(id);
            Learner[] dudes = new Learner[students.personCount()];
            int i = 0;
            for (Object student : students){
                dudes[i] = (Learner) student;
                i++;
            }
            teacher.lecture(dudes,numberOfHours);
        }

        public Map<Student, Double> getStudyMap(){
            Map<Student, Double> studentMap = new HashMap<>();
            for (Student student: (Iterable<Student>) students){
                studentMap.put(student, student.getTotalStudyTime());
            }return studentMap;
        }


    }

