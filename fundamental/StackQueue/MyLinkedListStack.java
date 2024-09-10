package dataStructureAlgorithm.StackQueue;

public class MyLinkedListStack implements IStackQueue {
    private Node topNode;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public boolean push(int val) {
        if (!isFull()) {
            Node newNode = new Node(val);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            Node node = topNode;
            topNode = topNode.next;
            return node.value;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        Node temp = topNode;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
