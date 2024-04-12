package dataStructureAlgorithm.StackQueue;

public class MyMainArrayStack {
    public static void main(String[] args) {
        IStackQueue myStack = new MyArrayStack(-2);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("---");
        myStack.push(5);
        myStack.show();

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        myStack.show();
    }
}
