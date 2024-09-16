package fundamental.numberTheory;

import java.util.HashMap;
import java.util.Map;

public class _914_X_of_a_Kind_in_a_Deck_of_Cards {
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> occur = new HashMap<>();
        for(int i: deck) {
            occur.put(i, occur.getOrDefault(i, 0) + 1);
        }
        int appear  = 0;
        for(int i: occur.values()) {
            appear = gcd(appear, i);
        }

        return appear > 1;
    }

     static int   gcd(int a,int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int[] deck = {1,1,2,2,2,2};
        System.out.println(hasGroupsSizeX(deck));

    }
}
