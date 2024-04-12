package dataStructureAlgorithm._28Tech.numberTheory;

// idea is to mark all the multiples of a number as not prime

// then we will get all the prime numbers
// time complexity is O(nloglogn)
// space complexity is O(n)
// this is the most efficient way to find prime numbers

// it only works for n<=10^7 because I check a number is prime through index of
// //the array which is not possible for n>10^7 because of memory limit



public class SievePrimes {
    private static final int MAX = 100;
    private static boolean[] isPrime = new boolean[MAX + 1];



    public static void main(String[] args) {
        for(int i=0; i<=MAX; i++){
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i*i<=MAX; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=MAX; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=0; i<=MAX; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }


    }
}
