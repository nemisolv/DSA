package dataStructureAlgorithm.hashTable;

import java.util.*;

public class MyHashMap {
    private class Data {
        int key,value;
        Data(int key,int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || getClass() != other.getClass()) return false;
            Data data = (Data) other;
            return key == data.key;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }
    private static final int  SIZE = 1000;
    private ArrayList<Data> myBuckets[];

    MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key){
        return key % SIZE;
    }


    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        ArrayList<Data> bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >=0) {
            bucket.get(keyIndex).value = value;
        }else {
            bucket.add(newData);
        }
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        ArrayList<Data> bucket = myBuckets[hashValueIndex];
        Data data = new Data(key,0);
        int keyIndex = bucket.indexOf(data);
        if(keyIndex >=0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public void remove(int key) {

        int hashValueIndex = hashFunction(key);
        ArrayList<Data> bucket = myBuckets[hashValueIndex];
        Data data = new Data(key,0);
        bucket.remove(data);

    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap() ;
        map.put(1,1);
        map.put(1,2);

        map.put(223,3);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
        System.out.println(map.get(22));
        System.out.println(map.get(223));
        map.remove(22);
    }
}