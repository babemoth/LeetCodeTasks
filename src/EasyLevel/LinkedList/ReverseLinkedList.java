package EasyLevel.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;

        ListNode second = head.next;
        head.next = null;

        ListNode rest = reverseList(second);
        second.next = head;
        return rest;
    }
}
