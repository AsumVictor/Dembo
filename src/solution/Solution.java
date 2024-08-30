package solution;

import linkedlist.ListNode;

public class Solution {

    public ListNode mergeTwoSortedLinkedList(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(a != null && b != null){

            if(a.data < b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if(a == null){
            tail.next = b;
        }

        if(b == null){
            tail.next = a;
        }

        return dummy.next;
    }

    public ListNode mergeTwoNumbers(ListNode a, ListNode b){
        int remainder = 0;
        ListNode dummy = new ListNode(-1);
        ListNode pointer = dummy;

        while(a!= null || b != null){
            int val_a = (a == null) ? 0 : a.data;
            int val_b = (b == null) ? 0 : b.data;
            int sum = val_b + val_a + remainder;

            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;

            remainder = sum / 10;

            if(a != null){
                a = a.next;
            }

            if(b != null){
                b = b.next;
            }

        }

        if(remainder > 0){
            pointer.next = new ListNode(remainder);
        }

        return dummy.next;
    }
}
