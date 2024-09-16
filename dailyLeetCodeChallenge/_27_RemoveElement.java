package dailyLeetCodeChallenge;

public class _27_RemoveElement {
    //tuy nhiên nếu test case lớn thì runtime sẽ rất lâu và tốn bộ nhớ
    public static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }//3,2,2,3->3,2,3
                n--;
            }
            //nếu sau khi dịch về phía trước 1 ô trong mảng mà không tìm thấy val 1 lần nữa mới ++
            else i++;
        }
        return n;
    }

    // dùng phương pháp 2 con trỏ
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        //1 con trỏ k và 1 con trỏ i(i chỉ việc chạy)
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        // chỉ số k lại chính = số lượng phần tử luôn
        return k;
    }


    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
//        System.out.println(removeElement2(nums,2));
    }
}
