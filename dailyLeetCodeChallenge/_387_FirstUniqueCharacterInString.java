package dailyLeetCodeChallenge;

public class _387_FirstUniqueCharacterInString {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        // 123 phần tử vì xâu s toàn chữ cái thường mà trong mảng bảng mã ascii từ a->z tương ứng với 97->122 -> size là 123(nhiều hơn cũng không sao chỉ tốn bộ nhớ thôi:))
        int[] count = new int[123];
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            // ép từ chữ cái sang dạng số tương ứng trong bảng ascii
            int index =  arr[i];
            count[index]++;
        }
        for (int i = 0; i < n; i++) {
            int index =  arr[i];
            //index của mảng count(mảng chứa số lần xuất hiện các chữ cái) == 1 thì trả về chỉ số của mảng arr;
            if (count[index] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
