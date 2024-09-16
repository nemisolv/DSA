package dailyLeetCodeChallenge;
// cho 2 mảng:merge mảng 2 vào mảng 1(mảng 1 có size tương đối là size1+size2)

import java.util.Arrays;

public class _88_MergeSortedArray {
    public void merge1(int[] n1, int m, int[] n2, int n) {
        for (var ai : n2) {
            insertEleInArray(n1, ai, m);
            m++;
        }
    }

    // sử dụng 2 loop sẽ tốn nhiều thời gian -> Time complexity : O(n^2)
    private void insertEleInArray(int[] a, int x, int m) {
        boolean isFound = false;
        for (int i = 0; i < m; i++) {
            if (a[i] > x) {
                isFound = true;
                for (int j = m - 1; j >= i; j--) {
                    a[j + 1] = a[j];
                }
                a[i] = x;
                break;
            }
        }
        if (isFound == false) {
            a[m] = x;
        }
    }

    // sử dụng kĩ thuật 2 con trỏ chỉ dùng 1 loop -> Time complexity: O(n)
    public void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        while (k >= 0) {
            if (i < 0) {
                n1[k] = n2[j];
                j--;
            } else if (j < 0) {
                n1[k] = n1[i];
                i--;
            } else if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        _88_MergeSortedArray bai = new _88_MergeSortedArray();
        bai.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

}
