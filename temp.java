import java.util.Arrays;
import java.util.Scanner;

public class temp {

    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int temp[] = new int[n];
    // tim i: vi tri dau tien cua so am
        int i = -1;
        while(i + 1 < n && a[i+1] < 0) {
            i++;
        }
        // tim j: vi tri dau tien cua so duong
        int j = i + 1;
        int k =0;
        while(i >=0 && j < n) {
            if(a[i] * a[i] < a[j] * a[j]) {
                temp[k++] = a[i] * a[i];
                i--;
            } else {
                temp[k++] = a[j] * a[j];
                j++;
            }
        }
        while(i >= 0) {
            temp[k++] = a[i] * a[i];
            i--;
        }
        while(j < n) {
            temp[k++] = a[j] * a[j];
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        //     a[i] = scanner.nextInt();
        // }

        int a [] = {-4,-1,0,3,10};


        temp myTemp = new temp();
        int[] result = myTemp.sortedSquares(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}