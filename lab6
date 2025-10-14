import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * lab6.java
 * fall 2025
 * 
 * Chidi Emenike
 * 
 * convert String to double using Java Collection Stack and Queue
 */

public class lab6 {
    public static void main(String[] args) {

        // test cases - add x3 additional cases here
        test("6", 6.0);
        test("7,000,000", 7000000.0);
        test(" $$$7 000 000 ", 7000000.0);
        test("$5,678.13 ", 5678.13);
        test("$0.25", 0.25);
        test(" -$.25", -0.25);
        test("-8.96", -8.96);
        


        // *** add three additional test cases here
        test("-999.23", -999.23);
        test("$990,000", 990000.0); 
        test("-$34.2", -34.2);

    }// main

    private static double toDouble(String a) {

        double answer = 0.0;

        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        boolean decimalFound = false; // *** may or may not use this approach
        boolean negative = false; // *** may or may not use this approach

        // *** add code here ***
        for (int b = 0; b < a.length(); b++) {
            char h = a.charAt(b);

            if (h == '-') {
                negative = true;
        }
        else if (h == '.') {
            decimalFound = true;
        }
        // Check if character is a digit
        else if (Character.isDigit(h)) {
            int digit = Character.getNumericValue(h);

            if (!decimalFound) {
                // adds to the stack
                s.push(digit);
            } else {
                // adds to the queue
                q.add(digit);
            }
        }
        // ignore all other characters
    }
           double multiplier = 1.0;
           double integerPart = 0.0;

    while (!s.isEmpty()) {
        integerPart = integerPart + (s.pop() * multiplier);
        multiplier = multiplier * 10;
    }
           double divisor = 10.0;
           double fractionPart = 0.0;
    while (!q.isEmpty()) {
        fractionPart = fractionPart+ q.remove() / divisor;
        divisor = divisor * 10;
    }
        answer = integerPart + fractionPart;
            if (negative) {
        answer *= -1;
    }

        return answer;

    }// toDouble

    // test method
    private static void test(String s, double expected) {

        double actual = toDouble(s);

        if (actual == expected)
            System.out.printf("Passed: %15s => %15f\n", s, actual);
        else
            System.out.printf(" Error: %15s => %15f   Expected: %15f\n", s, actual, expected);

    } // test

}// class
