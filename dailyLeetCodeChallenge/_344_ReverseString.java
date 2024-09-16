package dailyLeetCodeChallenge;

public class _344_ReverseString {
//    public static void reverseString(char[] s) {
//        int left = 0;
//        int right = s.length - 1;
//        while (left < right) {
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//
//            left++;
//            right--;
//        }
//    }

    //cách 2 :using recursion

    public static void swap(char[] a, int i, int j) {
        if (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            swap(a, i + 1, j - 1);
        }
    }

    public static void reverseString(char[] s) {
        swap(s,0,s.length-1);
    }
}
