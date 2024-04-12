package dataStructureAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countAlphaUseHashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                count++;
                map.replace(s.charAt(i),count);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
