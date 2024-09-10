package dataStructureAlgorithm.dailyLeetCodeChallenge;

public class _941_Valid_Mountain_Array {
    /*Concept:The basic idea is to traverse the array up the mountain, starting from the beginning, until we reach the peak.
    We then traverse down the mountain, starting from the peak, until we reach the end of the array.
    If we successfully reach the end of the array, then the array is a valid mountain array.
   * */
    public static boolean validMountainArray(int[] a) {
        //cach1
        if (a.length < 3) return false;
        boolean isIncreasing = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) { //day giam
                if (isIncreasing == true) {
                    isIncreasing = false;
                }
                if (i == 0) {
                    return false;
                }
            } else if (a[i] < a[i + 1]) { //day tang

                if (isIncreasing == false) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (isIncreasing == false) return true;

        return false;


        //cach2
//        int n = a.length;
//        if (n < 3) return false;
//        int i = 0;
//        while (i < n - 1 && a[i] < a[i + 1]) {
//            i++;
//        }
//        if (i == 0   // day luon giam
//                || i == n - 1 //day luon tang
//        )
//            return false;
//        while (i < n - 1 && a[i] > a[i + 1]) {
//            i++;
//        }
//        return i == n - 1;
    }


    public static void main(String[] args) {
        int a[] = {0, 2, 3, 4, 5, 2,4, 1, 0};
        System.out.println(validMountainArray(a));
    }

}
