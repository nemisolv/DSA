package dataStructureAlgorithm.numberTheory;

public class _2413_Smallest_Even_Multiple {
    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(3));
    }


}
