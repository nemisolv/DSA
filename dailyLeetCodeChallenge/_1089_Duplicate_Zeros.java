package dailyLeetCodeChallenge;

import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                // dịch phần tử mảng về sau 1 ô
                for (int j = arr.length -1; j >i ; j--) {
                    arr[j] = arr[j-1];
                }
                //vì giá trị cần tìm là 0 và duplicate value cũng là 0 nên khi dịch chuyển mặc định đã làm việc gán r
                    arr[i+1] = 0;
                //bỏ qua phần tử tiếp theo vì duplicate zero r
                ++i;

            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }
}
