package dailyLeetCodeChallenge;

import java.util.Arrays;
// ở bài này phải implement thuật toán sắp xếp có O(nlogn) or nhỏ hơn,những thuật toán như bubbleSort,insertionSort,selectionSort có O(n^2) sẽ gặp ngoại lệ exceed time.
public class _912_SortAnArray {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    private static int[] mergeSort(int a[],int L,int R){
        if(L>R) return new int[0]   ;
        if(L==R){
            int[] singleElement = {a[L]};
            return singleElement;
        }

        int k = (L+R)/2;
        int n1[] =  mergeSort(a,L,k);
        int n2[] = mergeSort(a,k+1,R);
        int result[]  = merge(n1,n2);
        return result;

    }
    private static int[] merge(int[] n1,int[] n2) {
        int i = 0, i1 = 0,i2 =0;
        int n = n1.length + n2.length;
        int[] result = new int[n];

        while (i<n) {
            if(i1<n1.length && i2<n2.length) {
                if(n1[i1] <n2[i2]) {
                    result[i] = n1[i1];
                    i++;i1++;
                }
                else {
                    result[i] = n2[i2];
                    i++;i2++;
                }
            }
            else {
                if(i1<n1.length) {
                    result[i] = n1[i1];
                    i++;i1++;
                }
                else {
                    result[i] = n2[i2];
                    i++;i2++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
int a[] = {9,0,6,8,11,2,-3};
        System.out.println(Arrays.toString(sortArray(a)));
    }
}
