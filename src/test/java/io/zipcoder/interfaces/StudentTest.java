package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void learn() {
        Student person = new Student(49949, "Aarti");
        person.learn(500.0);
        double expected = 500.0;
        double actual = person.getTotalStudyTime();

        Assert.assertEquals(expected,actual,.0004);
    }
}
