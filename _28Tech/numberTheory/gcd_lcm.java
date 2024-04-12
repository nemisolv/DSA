package dataStructureAlgorithm._28Tech.numberTheory;

public class gcd_lcm {
    static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    static int lcm(int a, int b) {
        return a/gcd(a,b)*b;
    }

    public static void main(String[] args) {
        System.out.println(gcd(84,18));
        System.out.println(lcm(84,18));
    }
}
