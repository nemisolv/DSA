package dataStructureAlgorithm.dailyLeetCodeChallenge;

import java.util.Stack;

public class ass {
    static public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!=']') {
                stack.push(c);
            }else {
                String loopStr = "";
                while(stack.peek()!='['){
                    loopStr = stack.pop() +loopStr;
                }
                //remove square bracket
                stack.pop();
                //get number loop string
                String numberLoopStr = "";
                while( stack.isEmpty() == false && Character.isDigit(stack.peek()) ) {
                    numberLoopStr = stack.pop() + numberLoopStr;
                }
                loopStr = loopStr.repeat(Integer.parseInt(numberLoopStr));
                for (int j = 0; j < loopStr.length(); j++) {
                    stack.push(loopStr.charAt(j));
                }
            }
        }
        String res = "";
        while(stack.isEmpty() == false) {
            res = stack.pop() +res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
}
