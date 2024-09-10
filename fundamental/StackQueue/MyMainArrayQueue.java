package dataStructureAlgorithm.StackQueue;

public class MyMainArrayQueue {
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(3);
        queue.show();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.show();

        System.out.println(queue.pop());;
        queue.push(99);
        queue.push(88);
        queue.pop();
        queue.push(77);
        queue.show();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("---");
        queue.show();
        queue.push(454);
        queue.push(123);
        System.out.println("********");
        queue.show();
    }
}
