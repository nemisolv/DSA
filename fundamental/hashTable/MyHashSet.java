package fundamental.hashTable;


//import java.util.Set;
import java.lang.reflect.Array;
import java.util.*;

// add contain remove size addAll removeAll
public class MyHashSet {
    public static void main(String[] args) {
       HashSet<Integer> mySet = new HashSet<>();
        mySet.add(3);
        mySet.add(1);
        mySet.add(2);
        mySet.add(-2);

        for(int x: mySet){
            System.out.print(x + " ");
        }
        System.out.println();
       HashSet<Integer> mySet1 = new HashSet<>();
       Random rand = new Random();
        for (int i = 0; i <= 10; i++) {
            mySet1.add(rand.nextInt(22));
        }

        System.out.println();
        for(int x: mySet1){
            System.out.print(x + " ");
        }
        System.out.println();
        mySet.removeAll(mySet1);
        for(int x: mySet){
            System.out.print(x + " ");
        }






    }
}
