package dataStructureAlgorithm.dailyLeetCodeChallenge;

public class sortingAlgorithm {

    // printArray
    private static void showArray(int index, int[] a) {
        int n = a.length;
        System.out.print("Lần " + index + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // bubbleSort
    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    isSorted = false;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (isSorted) break;
            showArray(i, nums);

        }
    }
// insertionSort
    //sau vòng lặp thứ i ta coi dãy [0;i] đã được sắp xếp,do đó ta chèn vào dãy đó 1 cách hợp lí,chính vì thế và bắt đầu từ i = 1-> insertionSort:)
    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i-1;
            while(j>=0 && a[j] >ai) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
            showArray(i,a);
        }
    }

    //selectionSort: khác insertionSort ở chỗ  insertion khi chạy đã được sắp xếp tăng dần nhưng không hoàn toàn đúng bởi khi chạy loop tiếp theo có thể sẽ tìm được phần tử nhỏ hơn
    // còn select thì sẽ luôn tìm thấy i phần tử min qua i lần loop
    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j <n; j++) {
                if(a[j] < a[minIndex]) minIndex = j;
            }
            if(minIndex!=i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
            showArray(i,a);
        }
    }


    public static void main(String[] args) {
        int nums[] = {5, 3, 2, 7, 8, 1, 2};
//        bubbleSort(nums);
//        insertionSort(nums);
        selectionSort(nums);
    }

}