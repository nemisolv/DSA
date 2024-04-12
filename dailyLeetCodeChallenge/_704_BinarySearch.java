package dataStructureAlgorithm.dailyLeetCodeChallenge;

public class _704_BinarySearch {
    private static int search(int[] a,int val) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n-1;
        while (iLeft<=iRight) {
            int iMid = (iLeft + iRight)/2;
            if(a[iMid] == val){
                return iMid;
            }
            else if(a[iMid] <val) {
                iLeft =iMid +1;
            }
            else {
                iRight = iMid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int [] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,2));
    }

}
