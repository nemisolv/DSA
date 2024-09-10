package dataStructureAlgorithm.StackQueue;

public class MyArrayStack implements IStackQueue {
    private static int SIZE = 4;
    private int[] arr;
    private int topIndex;

    public MyArrayStack(int size) {
        if (size > 0) {
            SIZE = size;
        }
        arr = new int[SIZE];
        topIndex = -1;

    }

    @Override
    public boolean push(int val) {
        if (!isFull()) {
            arr[++topIndex] = val;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = arr[topIndex];
            topIndex--;

        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public void show() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");

        }else {
            for (int i = topIndex; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


}
