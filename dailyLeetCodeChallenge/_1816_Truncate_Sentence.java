package dailyLeetCodeChallenge;

public class _1816_Truncate_Sentence {
    public String truncateSentence(String s, int k) {
        int countSpace = 0;
        s = s+" ";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                countSpace++;
            }
            if(countSpace==k){
                return s.substring(0,i);
            }
        }
        return null;
    }
}
