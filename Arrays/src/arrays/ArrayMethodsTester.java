package arrays;

import java.util.Arrays;

/**
 * DO NOT CHANGE ANYTHING IN THIS CLASS.
 */
public class ArrayMethodsTester {

    static boolean fibPass = true;
    static boolean pivotPass = true;

    public static void main(String[] args) {
        testExtractValidMarks();
        testFibonacci();
        testPivot();
        testReplaceVowels();
        testStringLengths();
    }

    public static void testExtractValidMarks() {
        String method = "extractMarks";
        int[] marks = {25, -1, 95, 61, 101, 40, 155, 0, 100, -33, 1, 99};
        int[] expected = {25, 95, 61, 40, 0, 100, 1, 99};
        int[] actual = ArrayMethods.extractValidMarks(marks);
        if (!Arrays.equals(expected, actual)) {
            System.out.println(method + " FAIL: Expected " + Arrays.toString(expected) + ", Found: " + Arrays.toString(actual));
        } else {
            System.out.println(method + " PASS");
        }
    }

    public static void testFibonacci() {
        testFibonacciDelegate(0);
        testFibonacciDelegate(1);
        testFibonacciDelegate(2);
        testFibonacciDelegate(5);
        testFibonacciDelegate(10);
        testFibonacciDelegate(15);
        testFibonacciDelegate(20);
        if (fibPass) {
            System.out.println("fibonacci PASS");
        }
    }

    public static void testFibonacciDelegate(int count) {
        String method = "fibonacci";
        int[] fibs = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        int[] expected = new int[count];
        for (int i = 0; i < count; i++) {
            expected[i] = fibs[i];
        }
        int[] actual = ArrayMethods.fibonacci(count);
        if (!Arrays.equals(expected, actual)) {
            System.out.println(method + " (size = " + count + "): FAIL: Expected " + Arrays.toString(expected) + ", Found: " + Arrays.toString(actual));
            fibPass = false;
        }
    }

    public static void testPivot() {
        String method = "pivot";
        int[] nums = {25, -1, 95, 61, 101, 40, 155, 0, 100, -33, 1, 99};
        int val = 61;
        int[] expected = {25, -1, 40, 0, -33, 1, 61, 95, 101, 155, 100, 99};
        int[] actual = ArrayMethods.pivot(nums, val);
        if (!Arrays.equals(expected, actual)) {
            System.out.println(method + " FAIL: Expected " + Arrays.toString(expected) + ", Found: " + Arrays.toString(actual));
            pivotPass = false;
        }

        val = 1;
        int[] expected2 = {-1, 0, -33, 1, 25, 95, 61, 101, 40, 155, 100, 99};
        actual = ArrayMethods.pivot(nums, val);
        if (!Arrays.equals(expected2, actual)) {
            System.out.println(method + " FAIL: Expected " + Arrays.toString(expected2) + ", Found: " + Arrays.toString(actual));
            pivotPass = false;
        }

        if (pivotPass) {
            System.out.println(method + " PASS");
        }

    }

    public static void testReplaceVowels() {
        String method = "replaceVowels";
        String[] items = {
            "hello",
            "hello world",
            "the rain in spain falls mainly in the plain",
            "yaaaaaaay"
        };
        String[] expected = {
            "h*ll*",
            "h*ll* w*rld",
            "th* r**n *n sp**n f*lls m**nly *n th* pl**n",
            "y*******y"
        };
        String[] actual = ArrayMethods.replaceVowels(items, '*');
        if (!Arrays.equals(expected, actual)) {
            System.out.println(method + " FAIL: Expected " + Arrays.toString(expected) + ", Found: " + Arrays.toString(actual));
        } else {
            System.out.println(method + " PASS");
        }
    }

    public static void testStringLengths() {
        String method = "stringLengths";
        String[] items = {
            "hello",
            "hello world",
            "the rain in spain falls mainly in the plain",
            ""
        };
        int[] expected = {5, 11, 43, 0};
        int[] actual = ArrayMethods.stringLengths(items);
        if (!Arrays.equals(expected, actual)) {
            System.out.println(method + " FAIL: Expected " + Arrays.toString(expected) + ", Found: " + Arrays.toString(actual));
        } else {
            System.out.println(method + " PASS");
        }
    }

} // end class
/**
 * DO NOT CHANGE ANYTHING IN THIS CLASS.
 */
