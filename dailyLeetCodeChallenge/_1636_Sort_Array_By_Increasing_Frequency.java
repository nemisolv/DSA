package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.*;

public class _1636_Sort_Array_By_Increasing_Frequency {
    static class Node implements Comparable {
        int value;
        int freq;
        Node (int val,int freq) {
            this.value = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof Node) {
                Node other = (Node) o;
                if(other.freq == this.freq){
                    return -Integer.compare(this.value,other.value);
                }
                return Integer.compare(this.freq,other.freq);
            }
            return 0;
        }
    }
    public static int[] frequencySort(int[] a) {
        int ADD_VALUE = 100;
        int MAX_SIZE = 100  + ADD_VALUE;
        int count[] = new int[MAX_SIZE + 1];
        for (int i = 0; i < a.length; i++) {
            int convertedValue = a[i] + ADD_VALUE;
            count[convertedValue]++;
        }
        // cách 1: using arrayList rồi sort
//        ArrayList<Node> mList = new ArrayList<>();
//        for (int convertedValue = 0; convertedValue <=MAX_SIZE; convertedValue++) {
//            if(count[convertedValue]>0) {
//                int originValue = convertedValue - ADD_VALUE;
//                Node newNode = new Node(originValue,count[convertedValue]);
//                mList.add(newNode);
//            }
//        }
//        Collections.sort(mList);
//
        int[] ans = new int[a.length];
        int index =0;
//        for(var node:mList) {
//            int freq = node.freq;
//            for (int i = 0; i < freq; i++) {
//                ans[index++] = node.value;
//            }
//
//        }
        //cách 2: using priority queue
//        Queue<Node> pQueue = new PriorityQueue<>();
//        for (int convertedValue = 0; convertedValue <= MAX_SIZE ; convertedValue++) {
//            if(count[convertedValue] > 0){
//                int originValue = convertedValue - ADD_VALUE;
//                Node newNode = new Node(originValue,count[convertedValue]);
//                pQueue.add(newNode);
//            }
//        }
//        while(pQueue.isEmpty() == false) {
//            Node node = pQueue.poll();
//            for (int i = 0; i < node.freq; i++) {
//                ans[index++] = node.value;
//            }
//
//        }
        //cách 3: using treeSet
        Set<Node> mySet = new TreeSet<>();
        for (int convertedValue = 0; convertedValue <= MAX_SIZE; convertedValue++) {
            if(count[convertedValue] >0) {
                int originalValue = convertedValue - ADD_VALUE;
                Node newNode = new Node(originalValue,count[convertedValue]);
                mySet.add(newNode);
            }
        }
     for(Node node: mySet) {
         int freq = node.freq;
         for (int i = 0; i < freq; i++) {
             ans[index++] = node.value;
         }
     }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort(new int[]{1,1,2,2,2,3}));
    }
}
