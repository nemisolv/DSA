package dataStructureAlgorithm.dailyLeetCodeChallenge;

public class _7_ReverseInteger {
    public static int reverse(int x) {
        long rev = 0;
        long temp = Math.abs(x);
        while (temp>0)
        {
            rev = rev*10 + temp%10;
            temp/=10;
        }
        return  rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE?0:x<0?(int)rev*-1:(int)rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
