package fundamental.StackQueue;

public class MyMainLinkedListStack {

    public static void main(String[] args) {
        MyLinkedListStack myStack = new MyLinkedListStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.show();
        myStack.pop();
        myStack.push(4);
        myStack.show();
    }
}
