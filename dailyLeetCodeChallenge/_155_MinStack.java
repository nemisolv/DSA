package dailyLeetCodeChallenge;

import java.util.Stack;

public class _155_MinStack {
    static class MinStack {
        public MinStack() {

        }

        static class Node {
            int value;
            int MIN;

            Node(int value) {
                this.value = value;
            }
        }

        Stack<Node> stack = new Stack();

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.MIN = stack.isEmpty() ? val : Math.min(val,stack.peek().MIN);
            stack.push(newNode);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().value;
        }

        public int getMin() {
            return stack.peek().MIN;
        }

        public static void main(String[] args) {

      MinStack minStack = new MinStack();
            minStack.push(1);
            minStack.push(2);
            minStack.push(-3);
            minStack.push(6);

        }
    }
}
