package dailyLeetCodeChallenge;

import java.util.Arrays;

public class quickSort {
    private static void quickSort(int[] a,int L,int R) {
        if(L>=R) return;
        // chọn k
        int key = a[(L+R)/2];
        // chia lại mảng
        int k = partition(a,L,R,key);
        // đệ quy lại
        quickSort(a,L,k - 1);
        quickSort(a,k,R);
    }

    private static int partition(int[] a, int L, int R,int key) {
        int iL = L;
        int iR = R;
        while (iL<=iR) {
            while (a[iL] <key) iL++;
            while (a[iR] >key) iR--;
            if(iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {2,4,0,9,-2};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
