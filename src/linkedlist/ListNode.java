package linkedlist;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode (int new_data){
        data = new_data;
    }

    public void insertNext(ListNode node){
        next = node;
    }
}
