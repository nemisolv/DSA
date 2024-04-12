package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.Arrays;
import java.util.Set;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[curIndex]!=nums[i]) {
                nums[++curIndex] = nums[i];
            }
        }
        return curIndex + 1;
    }

    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(a);
        System.out.println(Arrays.toString(a));
    }
}
