package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.Collections;

public class _345_ReverseVowelsOf_a_String {
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        String vowels = "ueoaiUEOAI";
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            while (start < end && !vowels.contains(str[start] + ""))  {
                start++;
            }

            while (start < end && !vowels.contains(str[end] + "")) {
                end--;
            }
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return new String(str);

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

}
