package com.ubranians.interview;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InterviewMainTest {

    private InterviewMain interviewMain;

    @Before
    public void init() {
        interviewMain = new InterviewMain();
    }

    @Test
    public void task1Test() {
        interviewMain.task1();
    }

    @Test
    public void task2Test() {
        Integer[] testArray = {5, 3, 4, 108, 42, 23, 1};
        final Integer[] sorted = interviewMain.task2(testArray);
        assertEquals(Arrays.asList(1, 3, 4, 5, 23, 42, 108), Arrays.asList(sorted));
    }

    @Test
    public void task3Test() {
        String actual,
                expected;
        actual = interviewMain.task3("\n\n\t\n\n\t\n    test   test \t\t\t\t");
        expected = "\n\t\n\t\n test test \t";
        assertEquals(expected, actual);
        actual = interviewMain.task3("\n\t test \n\t ");
        expected = "\n\t test \n\t ";
        assertEquals(expected, actual);
        actual = "                        ";
        expected = " ";
        assertEquals(actual, expected);
    }

    @Test
    public void task4Test() {
        assertTrue(interviewMain.task4("(()())"));
        assertTrue(interviewMain.task4("(((())(())))"));
        assertFalse(interviewMain.task4("))(()("));
        assertFalse(interviewMain.task4("))))(((("));
    }


}
