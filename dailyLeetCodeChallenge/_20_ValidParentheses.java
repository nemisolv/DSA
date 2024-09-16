package dailyLeetCodeChallenge;

import java.util.Stack;

public class _20_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char topPeek = stack.peek();
                if ((c == ')' && topPeek == '(')
                        || (c == ']' && topPeek == '[')
                        || (c == '}' && topPeek == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean isDebug = isValid(s);
        System.out.println(isDebug);

    }
}
