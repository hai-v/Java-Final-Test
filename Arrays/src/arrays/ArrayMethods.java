package arrays;

/**
 * Complete any THREE methods.
 */
public class ArrayMethods {

    /**
     * Extracts valid marks - i.e., marks between 0 and 100 (inclusive of both).
     *
     * @param marks the input marks, some possibly invalid
     * @return a subset of the input marks containing only the valid ones.
     */
    public static int[] extractValidMarks(int[] marks) {
        return null;
    }

    /**
     * Returns the Fibonacci numbers up to the specified count. For example,
     * fibonacci(9) should return the first 9 Fibonaccci numbers -
     * [0,1,1,2,3,5,8,13,21]
     *
     * @param count how many Fibonacci numbers to return
     * @return an array of numbers representing the first [count] terms of the
     * Fibonacci sequence.
     */
    public static int[] fibonacci(int count) {
        return null;
    }

    /**
     * Reorganizes an array so that all values less than the key appear before
     * the key, and all values greater than the key appear after the key. The
     * ordering is otherwise preserved. It is assumed that (1) there are no
     * duplicates and (2) the key itself is one of the input numbers.
     *
     * Example 1: 
     * ---------- 
     * Suppose nums is [12,5,7,3,9,4,11] and the key is 7.
     * This means all values less than 7 should move to the front of the array,
     * followed by 7 itself, followed by all values greater than 7. So, in this
     * case, the result would be [5,3,4,7,12,9,11]
     *
     * Example 2: 
     * ---------- 
     * Suppose nums is [12,5,7,3,9,4,11] and the key is 9.
     * This means all values less than 9 should move to the front of the array,
     * followed by 9 itself, followed by all values greater than 9. So, in this
     * case, the result would be [5,7,3,4,9,12,11]
     *
     * @param nums the numbers to reorganize
     * @param key the value to "pivot" around
     * @return the reorganized numbers
     */
    public static int[] pivot(int[] nums, int key) {
        return null;
    }

    /**
     * Replaces vowels with the specified character.
     *
     * @param strings the input strings
     * @param replacement the character to replace the vowels
     * @return an array of strings with all vowels replaced by the replacement
     * character
     */
    public static String[] replaceVowels(String[] strings, char replacement) {
        return null;
    }

    /**
     * Finds the lengths of strings.
     *
     * @param strings the strings whose lengths should be found.
     * @return an array of integers representing the lengths of the input
     * strings
     */
    public static int[] stringLengths(String[] strings) {
        return null;
    }

} // end class
