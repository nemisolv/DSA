package hackerrank;


import static java.lang.Math.sqrt;

public class SievePrimes {
//1. sieve primes

    static final int SIZE = 1000; // => 10^7
    static boolean[] primes = new boolean[SIZE];

    static {
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
    }


    // b1: => set all elements to true value;

    // b2 : filter

    public static void sievePrimes() {
        primes[0] = primes[1] = false;

//        n = a*b, a and b , both of them at least one must be less than square root of n
        for (int i = 2; i <= Math.sqrt(SIZE); i++) {
            if (primes[i]) {
                // j = i*i instead of 2*i because of Avoiding Redundant Computation, for example:
                /*    5*2 vs 5^2
                        5*2: 10, 15,20, 25, 30...
                        5^2: 25, 30, 35,...
                        because: 10 = 2*5, 15 = 3*5, 20 = 4*5 == 2*10 => all numbers is iterated by 2, 3
                *
                * */
                for (int j = i * i; j < SIZE; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
//2. prime factorization

    /**
     * n = p1^e1 * p2^e2 * p3^e3... * pk^ek => number of divisor: d(n) = (e1 + 1) * (e2 + 1) * (e3 + 1)*... (ek+ 1 )
     * => multiple of all divisors: M(n) = n^(d(n)/2)
     */
    static void pt(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            while (n % i == 0) {
                System.out.printf("%d ", i);
                n /= i;
            }
        }
        // in case, n is a prime
        if (n > 1) System.out.print(n);
    }

    //3. least common multiple and greatest common division
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }


    //4. fibonnaci
    static long fibo(int n){
        long f[] = new long[n+1];
        f[0] = 0;f[1] = 1;
        for (int i = 2; i <=n ; i++) {
            f[i] = f[i-1] + f[i-2];
//            f[i]%=(1000000000+7);
        }

        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(92));
    }
}