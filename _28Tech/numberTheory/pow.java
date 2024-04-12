package dataStructureAlgorithm._28Tech.numberTheory;

public class pow {
    static int binPow(int a, int b) {
        if(b == 0) return 1;
        int res = binPow(a, b/2);
        if(b % 2 == 0) return res * res;
        else return res * res * a;
    }

    public static void main(String[] args) {
        System.out.println(binPow(2, 10));
    }
}
