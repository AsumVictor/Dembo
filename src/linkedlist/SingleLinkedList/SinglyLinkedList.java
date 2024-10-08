package linkedlist.SingleLinkedList;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
     private ListNode head;
     private int size;

     public ListNode getHead(){
         return head;
     }

     public void insert(int data){
         ListNode currentNode = head;
         ListNode newNode = new ListNode(data);
         if(head == null){
             head = newNode ;
             size++;

             return;
         }

         while (currentNode.next != null){
             currentNode = currentNode.next;
         }

         currentNode.insertNext(newNode);
         size++;

     }

     public void insertNode(ListNode node){
         head = node;
     }

     public String toString(){
         ListNode currentNode = head;
         String result = "";
         while(currentNode != null){
             result += "[" + currentNode.data +"]"+ "-->";
             currentNode = currentNode.next;
         }

         return result;
     }

     public int length(){
         return size;
     }

     public void insertAt(int index, int data){
           if(index > size - 1 || index < 0) return;
           ListNode currentNode = head;
           int trackIndex = 0;
           ListNode newNode = new ListNode(data);

           if(index == 0){
               newNode.insertNext(currentNode);
               head = newNode;
               size++;
               return;
           }

           while(trackIndex != index-1){
               currentNode = currentNode.next;
               trackIndex++;
           }


           newNode.insertNext(currentNode.next);
           currentNode.insertNext(newNode);
           size++;


     }

     public void deleteIndex(int index){

         if(index < 0 || index >= size ) return;

         ListNode currNode = head;
         int indexPointer = 0;
         if(index == 0){
             head = head.next;
             size--;
             return;
         }

         while(indexPointer != index - 1){
             currNode = currNode.next;
             indexPointer++;
         }

         currNode.insertNext(currNode.next.next);
         size--;

     }

     public int find(int data){
         int counter = 0;
         ListNode currNode = head;

         while(currNode != null){
              if(currNode.data == data) return counter;

              currNode = currNode.next;
              counter++;
         }

         return -1;
     }

     public void reverse(){
         ListNode prev = null;
         ListNode curr = head;
         ListNode next = null;

         while(curr != null){
             next  = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }

         head = prev;
     }

     public int nthFromEnd(int n){
         ListNode curr = head;
         ListNode prev = head;
         int counter = 0
                 ;
         while(counter < n){
             prev = prev.next;
             counter++;
         }

         while(prev != null){
             prev = prev.next;
             curr = curr.next;

         }

         return curr.data;
     }

     public void insertInSorted(int data){
         ListNode curr = head;
         ListNode prevNode = head;
         ListNode newNode = new ListNode(data);

         if(data < head.data){
             newNode.insertNext(head);
             head = newNode;
             return;
         }

         while(curr != null){
             if(curr.data > data) break;
             prevNode = curr;
             curr = curr.next;
         }

         newNode.insertNext(curr);
         prevNode.insertNext(newNode);
     }

     public boolean hasCycle(){
         ListNode fastPinter = head;
         ListNode slowPoniter = head;

         while(fastPinter != null){
             if(fastPinter == slowPoniter) return true;

             fastPinter = fastPinter.next.next;
             slowPoniter = slowPoniter.next;

         }

         return false;
     }

     public int startOfCycle(){
         Set<ListNode> trackedList = new HashSet<>();
         ListNode currNode = head;

         while (!trackedList.contains(currNode)){
             trackedList.add(currNode);
             currNode = currNode.next;
         }

         return currNode.data;
     }
};


