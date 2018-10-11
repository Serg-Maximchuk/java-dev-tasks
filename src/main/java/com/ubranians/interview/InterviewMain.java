package com.ubranians.interview;

import java.util.List;

public class InterviewMain {

    private final int magicNumber = 5;

    /**
     * Make that exception won't invoke.
     * You shouldn't change the {@link #magicNumber} and this method.
     * Only need to change method {@link #getFoo()}.
     */
    void task1() {
        int[] foo = getFoo();
        foo[magicNumber] = magicNumber;
    }

    /**
     * Change me
     */
    private int[] getFoo() {
        return new int[magicNumber];
    }


    private final int threshold = 42;

    /**
     * Transform input array to the array of {@link IntegerHolder}.
     * Filter elements where value less or equals {@link #threshold}.
     * Then sort the result in the ascending order and return List.
     */
    List<IntegerHolder> task2(Integer[] array) {
        return null;
    }

    static class IntegerHolder implements Comparable<IntegerHolder> {
        final Integer value;

        IntegerHolder(Integer value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IntegerHolder that = (IntegerHolder) o;

            return value.equals(that.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public int compareTo(IntegerHolder o) {
            return value - o.value;
        }
    }

    private final char[] repeatedChars = {' ', '\n', '\t'};

    /**
     * Replace in the input String all sequentially repeated characters by one
     * character from this repeated selection
     * E.g.: "\n\n\n\n\nTEST\n\n\n\t\t\t\t\t\t" -> "\nTEST\n\t"
     */
    String task3(String input) {
        return null;
    }


    private final char openBracket = '(';
    private final char closeBracket = ')';

    /**
     * Suppose that you have some math expression.
     * Test that each {@link #openBracket} has each {@link #closeBracket} in correct way.
     * E.g.: (()()) -> true
     * ))(()( -> false
     */
    boolean task4(String testString) {
        return false;
    }

    public static void main(String[] args) {

    }

}
