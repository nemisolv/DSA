package dailyLeetCodeChallenge;


import java.util.ArrayList;

public class _706_DesignHashMap {
    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];

    public class Data {
        private int key;
        private int value;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data)
                return this.key == ((Data) other).key;
            return false;
        }
    }

    public _706_DesignHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }

    }

    //hashFunction
    public int hashFunction(int key) {
        return key % SIZE;
    }

    // put
    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        ArrayList<Data> bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >=0){
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }
    // remove
    private void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDelete = new Data(key,0);
        bucket.remove(myDelete);
    }
    // get
    private int get(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key,0);
        int keyIndex = bucket.indexOf(findData);
        if(keyIndex >=0) return bucket.get(keyIndex).value;

        return -1;

    }

    public static void main(String[] args) {
        _706_DesignHashMap myMap = new _706_DesignHashMap();
        myMap.put(1,1);
        myMap.put(11,2);
        myMap.put(1,2);
        myMap.put(1,3);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(2));
        System.out.println(myMap.get(11));
        myMap.remove(1);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(1000));
    }
}
