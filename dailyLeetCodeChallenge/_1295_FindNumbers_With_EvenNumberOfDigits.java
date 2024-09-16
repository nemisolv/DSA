package dailyLeetCodeChallenge;
// đếm số phần tử có số lượng chữ số là số chẵn
public class _1295_FindNumbers_With_EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((Math.floor(Math.log10(nums[i])+1))%2==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
int nums [] = {0,12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
