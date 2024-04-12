package dataStructureAlgorithm._28Tech.numberTheory;

import java.math.BigInteger;

public class fibo {
    static BigInteger fibo(int n) {

        BigInteger[] fn = new BigInteger[n + 1];
        fn[0] = BigInteger.ZERO;
        fn[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fn[i] = fn[i - 1].add(fn[i - 2]);

        }
        return fn[n];

    }

    public static void main(String[] args) {
        System.out.println(fibo(931));
    }
}
