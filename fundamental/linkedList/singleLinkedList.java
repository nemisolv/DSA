package fundamental.linkedList;

public class singleLinkedList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked is empty!");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }

    }

    private static Node pushHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private static Node addToTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;


        return head;
    }

    private static Node insertIndex(Node head, int value, int index) {

        if (index == 0) return pushHead(head, value);
        else {
            Node newNode = new Node(value);
            Node curNode = head;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index + 1) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }

    // xóa
    private static Node removeAtHead(Node head) {
        if (head != null) {
            head = head.next;
            return head;
        }
        return head;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        // thêm vào đầu
        n1 = pushHead(n1,0);
        printLinkedList(n1);
        // thêm vào cuối
//        n1 = addToTail(n1,4);
//        n1 = addToTail(n1,9);
//        printLinkedList(n1);
        //thêm vào giữa
//        n1 = insertIndex(n1, 90, 0);
//        printLinkedList(n1);
//        n1 = insertIndex(n1, 99, 1);
//        printLinkedList(n1);
//
//        n1 = insertIndex(n1, 89, 2);
//        printLinkedList(n1);
//
//        n1 = insertIndex(n1, 111, 1);
//        printLinkedList(n1);
//
//         Node newList = removeAtHead(n1);
//        printLinkedList(n1);
//        printLinkedList(newList);

        //     ->90->1->111->99->89->2->3
    }
}
