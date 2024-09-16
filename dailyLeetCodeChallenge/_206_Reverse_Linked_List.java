package dailyLeetCodeChallenge;


public class _206_Reverse_Linked_List {
    public static class ListNode  {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        while(curNode!=null && curNode.next!=null) {
            ListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
      return head;
    }
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.val);

            if(temp.next!=null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        ListNode newList = reverseList(n1);
        printLinkedList(newList);

    }
}