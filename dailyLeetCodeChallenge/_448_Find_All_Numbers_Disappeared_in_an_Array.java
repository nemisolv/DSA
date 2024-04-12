package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disAppear = new ArrayList<>();
        boolean exist[] = new boolean[nums.length + 1];

        for(int i = 0 ;i < nums.length;i++) {

            exist[nums[i]] = true;
        }

        for( int i =1 ;i<= nums.length;i++) {
            if(exist[i]==false)
                disAppear.add(i);
        }
        return disAppear;
    }
    public static void main(String[] args) {



        }
}
