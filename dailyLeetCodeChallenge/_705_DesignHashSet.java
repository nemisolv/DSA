package dailyLeetCodeChallenge;

//import dateStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.ArrayList;

public class _705_DesignHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];

    _705_DesignHashSet() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        if (bucket.indexOf(key) == -1) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        ArrayList<Integer> bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        //lưu ý: remove chỉ nhật index do đó khi ta chuyền giá trị thì fail
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
       return keyIndex >=0;
    }

    public static void main(String[] args) {
        _705_DesignHashSet myHashSet = new _705_DesignHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1));
        myHashSet.remove(1);
        System.out.println(myHashSet.contains(1));

    }
}
