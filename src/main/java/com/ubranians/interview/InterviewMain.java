package com.ubranians.interview;

public class InterviewMain {

    /**
     * You shouldn't change this method.
     * Change method {@link #getFoo(int)}.
     */
    public void task1() {
        int i = 5;
        int[] foo = getFoo(i);
        foo[i] = i;
    }

    /**
     * Change me
     */
    private int[] getFoo(int i) {
        return new int[i];
    }


    /**
     * Sorting input array
     */
    public Integer[] task2(Integer[] array) {
        return null;
    }


    final char[] repeatedChars = {' ', '\n', '\t'};

    /**
     * Replace in the input String
     * all sequently repeated characters by one character
     * from this repeated selection
     * E.g.: "\n\n\n\n\nTEST\n\n\n\t\t\t\t\t\t" -> "\nTEST\n\t"
     */
    public String task3(String input) {
        return null;
    }


    final char openBracket = '(',
            closeBracket = ')';

    /**
     * Suppose that you have some math expression.
     * Test that each {@link #openBracket} has each {@link #closeBracket} in correct way.
     * E.g.: (()()) -> true
     * ))(()( -> false
     */
    public boolean task4(String testString) {
        return false;
    }


}
