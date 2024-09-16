package dailyLeetCodeChallenge;

public class _69_SqrtOf_X {
    public static int sqrt(int x) {
        int l = 0;
        int r = x;
        int m = x/2;
        while (l <= r) {
            m = l + (r - l)/ 2;
            if (m * m < x) {
                l = m + 1;
            } else if (m * m > x) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return m;
    }
    public static int mySqrt(int x) {
        if(x == 1) return 1;
        int l = 0;
        int r = x;
        while(l < r ){  // ** not l < r => think about the case r = l + 2
            int mid = l + (r - l) / 2;
            if(mid == x / mid) return mid; // prevent from mid * mid overflow
            else if(mid > x / mid) r = mid;  // prevent from mid * mid overflow
            else l = mid; // *** not l = mid + 1
        }
        return l;
    }


    public static void main(String[] args) {
        int x = 3;
        System.out.println(mySqrt(x));
    }
}
