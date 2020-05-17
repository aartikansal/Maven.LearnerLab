package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void getInstance() {
        int actual = Students.getInstance().personCount();
        int expected = 5;

        Assert.assertEquals(actual, expected);

    }
}
