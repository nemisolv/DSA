package dailyLeetCodeChallenge;

import java.util.HashSet;

public class _1346_Check_If_N_and_Its_DoubleExist {
//    public static boolean checkIfExist(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i] == 2* arr[j] || arr[j] == arr[i]*2) {
//                    return true;
//                }
//            }
//        }
//
//return false;
//    }
    //sử dụng hashset đẻ tối ưu hơn O(n) > O(n^2)
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer item : arr) {
            if(set.contains(2*item) || (set.contains(item/2) && item %2==0)) {
                return true;
            }else {
                set.add(item);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int ar[] = {3,1,7,11};
        System.out.println(checkIfExist(ar));
    }
}
