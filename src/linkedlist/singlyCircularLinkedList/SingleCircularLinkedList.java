package linkedlist.singlyCircularLinkedList;

import linkedlist.SingleLinkedList.ListNode;

public class SingleCircularLinkedList {
     public ListNode head;
     private int size = 0;
     public ListNode tail;

     public boolean isEmpty(){
         return size == 0;
     }

     public void insert(int data){
         ListNode newNode = new ListNode(data);
         if(isEmpty()){
             head = newNode;
             tail = head;
             return;
         }
         tail.next = newNode;
         newNode.next = head;
         tail = newNode;
     }

     public void printEl(){
         ListNode currNode = head;

//         while() @params
     }


}
