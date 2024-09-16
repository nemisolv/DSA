package dailyLeetCodeChallenge;

import java.util.Arrays;
import java.util.HashMap;

/*
*
*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
* */
public class _1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(target - num)) {
                return new int[]{map.get(target - num), i};
            }
            map.put(num, i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] n = new int[]{3,12,78,3, 2,4};
        System.out.println(Arrays.toString(twoSum(n, 6)));
    }

}
