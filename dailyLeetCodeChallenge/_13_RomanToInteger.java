package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.Scanner;

/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
* */
public class _13_RomanToInteger {
    public static int romanToInt(String s) {
        int a[] = new int[20];
//        char roman[] = new char[20];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                a[i] = 1;
            } else if (s.charAt(i) == 'V') {
                a[i] = 5;
            } else if (s.charAt(i) == 'X') {
                a[i] = 10;
            } else if (s.charAt(i) == 'L') {
                a[i] = 50;
            } else if (s.charAt(i) == 'C') {
                a[i] = 100;
            } else if (s.charAt(i) == 'D') {
                a[i] = 500;
            } else if (s.charAt(i) == 'M') {
                a[i] = 1000;
            }
        }

        int res = a[s.length() - 1];
        for (int i = s.length() - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                res = res - a[i - 1];
            } else if (a[i] == a[i - 1] || a[i] < a[i - 1]) {
                res = res + a[i - 1];
            }
        }
        return res;
    }
    public int romanToInt2(String s) {

        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roman number: ");
        var x = sc.nextLine();
        System.out.println("Giá trị thập phân tương ứng của " + x + " là: " + romanToInt(x));
    }
}

