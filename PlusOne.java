import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*/

public class PlusOne {

    public static void main() {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int digitsLength = digits.length;
        for (int i = digitsLength - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                // Return as soon as plus one happens
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        // If the code hasn't returned already, that means we are dealing with edge cases like {9, 9, 9}
        // In Jva, bu default integer arrays get initialized with zeros. So, we just need to set the first index to 1. 
        int[] resultArray = new int[digitsLength + 1];
        resultArray[0] = 1;
        return resultArray;
    }
}
