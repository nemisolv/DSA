package dailyLeetCodeChallenge;

public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int j = n - 1;
        int i = 0;

        while (i < j) {
            if (nums[i] % 2 != 0) {
                if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                } else {
                    j--;
                }
            }// không cần kiểm tra điều kiện if ở dòng 12 vì trước khi đổi chỗ thì đã kiểm tra while và else rồi
            else {
                i++;
            }
        }

        return nums;
    }

//    public static int[] sortArrayByParity(int[] nums) {
//        int i = 0,j =0;
//        while( i < nums.length) {
//            if(nums[i]%2==0) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//            }
//        }
//
//        return nums;
//    }

    public static void main(String[] args) {
        int n[] = {1, 3};
        sortArrayByParity(n);
    }
}
