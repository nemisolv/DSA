package dataStructureAlgorithm.StackQueue;

public class MyArrayQueue implements IStackQueue {
    private static int SIZE = 4;
    private int[] arr;
    private int head;
    private int tail;

    MyArrayQueue(int size) {
        if (size > 0) {
            SIZE = size;
        }
        arr = new int[SIZE];
        head = tail = -1;
    }

    @Override
    public boolean push(int val) {

        if (!isFull()) {
            if (isEmpty()) {
                head++;
            }
            arr[++tail] = val;
            return true;
        }

        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = arr[head];
            head++;
            if (head > tail) {
                head = tail = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    @Override
    public boolean isFull() {
        return tail == SIZE - 1;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty, right now!");
        } else {
            for (int i = head; i <= tail; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
