package dailyLeetCodeChallenge;


public class _707_Design_Linked_List {
    static class MyLinkedList {
        private MyLinkedList.Node head;

        class Node {
            private int val;
            private MyLinkedList.Node next;

            public Node() {

            }

            public Node(int val) {
                this.val = val;
            }
        }

        public MyLinkedList() {
            head = null;
        }

        public int get(int index) {

            MyLinkedList.Node temp = head;
            int currentIndex = 0;
            while (temp != null) {
                if (currentIndex == index) {
                    return temp.val;
                }
                currentIndex++;
                temp = temp.next;
            }

            return -1;
        }

        public void addAtHead(int val) {
            MyLinkedList.Node newNode = new MyLinkedList.Node(val);
            newNode.next = head;
            head = newNode;
        }

        public void addAtTail(int val) {
            MyLinkedList.Node temp = head;
            if(temp == null) {
                addAtHead(val);
                return;
            }

            while (temp != null) {
                if (temp.next == null) {

                    temp.next = new MyLinkedList.Node(val);
                    break;
                }

                temp = temp.next;
            }

        }



        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            }  else {
                MyLinkedList.Node newNode = new MyLinkedList.Node(val);
                MyLinkedList.Node currentNode = head;
                int currentIndex = 0;
                while (currentNode != null) {
                    if(currentIndex == index -1) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        return;
                    }
                    currentIndex++;


                    currentNode = currentNode.next;

                }
                if(currentIndex == index) {
                    addAtTail(val);
                }
            }


        }

        public void deleteAtIndex(int index) {

            MyLinkedList.Node currentNode = head;
            MyLinkedList.Node prev = null;
            int currentIndex = 0;
            while (currentNode != null) {

                if (currentIndex == index) {
                    if(index ==0) {
                        head = head.next;
                    }else {

                        prev.next = currentNode.next;
                        return;
                    }

                }
                prev = currentNode;
                currentIndex++;
                currentNode = currentNode.next;

            }
        }

    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.get(0);


    }


}


