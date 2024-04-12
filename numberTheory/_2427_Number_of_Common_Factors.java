package dataStructureAlgorithm.numberTheory;

public class _2427_Number_of_Common_Factors {
    public static int commonFactors(int a, int b) {
            int count = 0;
            int n = a < b ? a : b;
            for(int i = 1;i<= n/2;i++) {
                if(a % i == 0 && b % i == 0) {
                    count++;
                }
            }

            // in case n(minimum of a and b) is a factor of both a and b
            if(a %n ==0 && b %n ==0) count++;
            return count;
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }
}
