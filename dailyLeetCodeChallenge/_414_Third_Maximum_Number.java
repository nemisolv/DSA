package dailyLeetCodeChallenge;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = n-1; i >0; i--) {
            if(nums[i] > nums[i-1]) {
                count++;
            }
            if(count==2) return nums[i-1];
        }
        return nums[n-1];
    }

    public static void main(String[] args) {
        int a[] = {2,2,3,1};
        System.out.println(thirdMax(a));
    }
    //way 2:
    public static int thirdMaxium(int[] a) {
        Integer first = null,second = null,third = null;
        for(Integer num: a){
            if (num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }
            if(first == null || num >first) {
                third = second;
                second = first;
                first = num;
            }else if(second == null || num>second){
                third = second;
                second = num;
            }else if (third == null || num >third) {
                third = num;
            }
        }
        return third == null ? first: third;
    }

}
