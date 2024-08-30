package linkedlist.DoubleLinkedList;
import linkedlist.SingleLinkedList.ListNode;

public class DoubleListNode extends  ListNode {
    public DoubleListNode prev;
    public DoubleListNode next;
    public DoubleListNode(int new_data) {
        super(new_data);
        prev = null;
        next = null;
    }

}
