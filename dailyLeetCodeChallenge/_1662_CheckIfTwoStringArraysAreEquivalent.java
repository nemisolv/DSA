package dailyLeetCodeChallenge;

public class _1662_CheckIfTwoStringArraysAreEquivalent {
    //Equivalent : tương đương
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //dùng stringbuilder sẽ tăng tốc độ hơn
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String a:word1) {
            // sẽ xử lí nhanh hơn so với việc cộng chuỗi
            sb1.append(a);
        }
        for (String a:word2) {
            sb2.append(a);
        }
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        String word1[] = {"abc", "d", "defg"};
        String word2[] = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
