package dailyLeetCodeChallenge;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> mySet = new HashSet<>();
        Set<Integer> myIntSet = new HashSet<>();
        for (var n : nums) {
            if (myIntSet.contains(n))
                return true;
            else myIntSet.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        _217_ContainsDuplicate mySet = new _217_ContainsDuplicate();
        System.out.println(mySet.containsDuplicate(a));
    }
}
