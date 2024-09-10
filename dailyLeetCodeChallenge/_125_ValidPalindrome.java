package dataStructureAlgorithm.dailyLeetCodeChallenge;

/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
* */
public class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        char l_ch, r_ch;

        while (left < right) {
            l_ch = s.charAt(left);
            r_ch = s.charAt(right);

            // System.out.println(String.format("%d : %d, %c : %c", left, right, l_ch, r_ch));

            if (!Character.isLetterOrDigit(l_ch))
                left++;
            else if (!Character.isLetterOrDigit(r_ch))
                right--;
            else if (Character.toLowerCase(l_ch) == Character.toLowerCase(r_ch)) {
                left++;
                right--;
            } else
                return false;
        }

        // isPalindrome
        return true;

        //way1:
//        s = s.toLowerCase();
//        String temp = "";
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)>=48 && s.charAt(i)<=57  )
//                temp+=s.charAt(i);
//            else if(s.charAt(i)>=65 && s.charAt(i)<=90) {
//                temp+=s.charAt(i);
//
//            }
//            else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
//                temp+=s.charAt(i);
//
//            }
//        }
//        StringBuilder str = new StringBuilder(temp);
//        return temp.equals(str.reverse().toString());


        //different way(2): it very helpfull but it runs slowly over using loop?
        // String regex = "[^a-zA-Z0-9]";
        // String tempString = s.replaceAll(regex,"").toLowerCase();
        // StringBuilder str = new StringBuilder(tempString);
        // return tempString.equals(str.reverse().toString());

    }
}
