package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDateTest {
    WeekDate weekDate;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void firstLastDateOfWeek() {
        //act
        String expected = "First Date of Week: Mon 24/12/2018 and Last date of the week:Sun 30/12/2018";


        //arrange
        String result = weekDate.firstLastDateOfWeek("27/12/2018");

        //assert
        assertEquals(expected,result);

    }
}