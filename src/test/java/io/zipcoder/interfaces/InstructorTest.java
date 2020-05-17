package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void teach() {
        double expected = 500.0;
        Student student = new Student(58585, "Aarti");
        Instructor teacher = new Instructor(39393, "April");
        teacher.teach(student,expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .0003);
    }

    @Test
    public void lecture() {
        Learner[] students = new Learner[3];
        Student student = new Student(30030, "Corey");
        Student student1 = new Student(39393, "Dave");
        Student student2 = new Student(393933, "ssss");
        Instructor instructor = new Instructor(2020, "Sandy");
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        instructor.lecture(students, 99.0);
        double expected = 33.0;
        double actual1 = student.getTotalStudyTime();
        double actual2 = student1.getTotalStudyTime();
        double actual3 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, 33.0);
        Assert.assertEquals(expected, actual2, 33.0);
        Assert.assertEquals(expected, actual3, 33.0);

    }
}
