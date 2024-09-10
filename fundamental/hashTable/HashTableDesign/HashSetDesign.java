package dataStructureAlgorithm.hashTable.HashTableDesign;

import java.util.ArrayList;

public class HashSetDesign {
    private final int SIZE =1000;
    ArrayList<Integer> buckets[];
    HashSetDesign() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }
    public int hashFunction(int key) {
        return key % SIZE;
    }
    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket =buckets[hashValueIndex];
        var keyIndex = bucket.indexOf(key);
        if(keyIndex < 0 ){
            bucket.add(key);
        }
    }
    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex>=0) {
            bucket.remove(keyIndex);
        }
    }
    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = buckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex>=0;
    }

    public static void main(String[] args) {
        HashSetDesign mySet = new HashSetDesign();
        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
        System.out.println( mySet.contains(1));
        mySet.remove(1);
        System.out.println( mySet.contains(1));

    }
}
