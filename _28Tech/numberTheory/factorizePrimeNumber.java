package dataStructureAlgorithm._28Tech.numberTheory;

public class factorizePrimeNumber {

    static void factorize(int n) {
        for(int i =2;i*i <=n;i++) {
            int count = 0;
            while(n%i==0) {
                count++;
                n/=i;

            }
            if(count>0) {
                System.out.printf("%d^%d ",i,count);
            }
        }
        if(n>1) System.out.printf("%d^1",n);
    }


    public static void main(String[] args) {
        factorize(84);
    }
}
