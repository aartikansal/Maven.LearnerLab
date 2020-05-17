package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zcw.hostLecture(5, 64.0);
        Student Aarti = (Student)students.findById(5L);
        Double expected = 12.8;
        Double actual = Aarti.getTotalStudyTime();
        assertEquals(expected, actual, 12.8);
    }
}
