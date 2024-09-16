package dailyLeetCodeChallenge;

public class _977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sortArray = new int[n];
        int i =0;
        while(i+ 1 < n && nums[i+1] <0 ) {
            i++;
        }

        int j = i+1;

        int k = 0;
        while( k < n) {
            if(i >=0 && j < n) {
                int temp = nums[i] * -1;
                if(temp < nums[j]) {
                    sortArray[k] = temp * temp;
                    i--;
                }else {
                    sortArray[k] = nums[j] * nums[j];
                    j++;
                }
            }else {
                if(i>=0) {
                    sortArray[k] = nums[i] *nums[i];
                    i--;
                }else if( j <n) {
                    sortArray[k] = nums[j] * nums[j];
                    j++;
                }
            }


            k++;
        }

        // System.out.println(Arrays.toString(sortArray));
        return sortArray;
    }
}
