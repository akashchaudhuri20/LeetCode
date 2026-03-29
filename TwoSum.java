import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public class TwoSum {

    public static void main() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> usedNumbers = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (usedNumbers.containsKey(target - currentNumber)) {
                return new int[]{usedNumbers.get(target - currentNumber), i};
            }
            usedNumbers.put(currentNumber, i);
        }
        return new int[0];
    }


}
