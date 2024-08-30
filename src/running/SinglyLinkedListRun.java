package running;

import linkedlist.ListNode;
import linkedlist.SinglyLinkedList;
import solution.Solution;

import java.util.List;

public class SinglyLinkedListRun {


    public static void main(String[] args){
        Solution solution = new Solution();
        SinglyLinkedList sll = new linkedlist.SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(4);
        sll.insert(5);
        sll.insert(6);
        sll.insert(7);
        sll.insert(8);
        sll.insertInSorted(99);

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n5.insertNext(n1);
        n4.insertNext(n5);
        n3.insertNext(n4);
        n2.insertNext(n3);
        n1.insertNext(n2);

        linkedlist.SinglyLinkedList sll2 = new linkedlist.SinglyLinkedList();
        sll2.insertNode(n1);

//        System.out.println(sll2.hasCycle());
//        System.out.println(sll2.startOfCycle());

        SinglyLinkedList a = new SinglyLinkedList();
         a.insert(0);
         a.insert(3);
         a.insert(4);
        a.insert(9);

        SinglyLinkedList b = new SinglyLinkedList();
        b.insert(1);
        b.insert(2);
        b.insert(5);
        b.insert(9);
        b.insert(9);

        SinglyLinkedList mergeSll = new SinglyLinkedList();
//        mergeSll.insertNode(solution.mergeTwoSortedLinkedList(a.getHead(), b.getHead()));

        SinglyLinkedList addTwoSll = new SinglyLinkedList();
        addTwoSll.insertNode(solution.mergeTwoNumbers(a.getHead(), b.getHead()));

        System.out.println(addTwoSll.toString());

    }
}
