package com.ubranians.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewMain {

    private final int magicNumber = 5;
    private final int threshold = 42;
    private final char[] repeatedChars = {' ', '\n', '\t'};
    private final char openBracket = '(';
    private final char closeBracket = ')';

    public static void main(String[] args) {

    }

    /**
     * Make that exception won't be thrown.
     * You shouldn't change the {@link #magicNumber} and this method.
     * You only have to change the {@link #getFoo()} method.
     */
    void task1() {
        int[] foo = getFoo();
        foo[magicNumber] = magicNumber;
    }

    /**
     * Change me
     */
    private int[] getFoo() {
        return new int[magicNumber + 1];
    }

    /**
     * Transform input array to the collection of {@link IntegerHolder}.
     * Filter elements where value less or equals {@link #threshold}.
     * Then sort the result in the ascending order and return List.
     */
    List<IntegerHolder> task2(Integer[] array) {
        return Arrays.stream(array).filter(integer -> integer <= threshold)
                .map(IntegerHolder::new)
                .sorted(IntegerHolder::compareTo)
                .collect(Collectors.toList());
    }

    /**
     * Replace in the input String all sequentially repeated characters by one
     * character from this repeated selection
     * E.g.: "\n\n\n\n\nTEST\n\n\n\t\t\t\t\t\t" -> "\nTEST\n\t"
     */
    String task3(String input) {
        return null;
    }

    /**
     * Suppose that you have some math expression.
     * Test that each {@link #openBracket} has each {@link #closeBracket} in correct way.
     * E.g.: (()()) -> true
     * ))(()( -> false
     * ()())(()() -> false
     */
    boolean task4(String testString) {
        final char[] chars = testString.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (c == openBracket) i++;
            else i--;
            if (i < 0) return false;
        }
        return true;
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

}
