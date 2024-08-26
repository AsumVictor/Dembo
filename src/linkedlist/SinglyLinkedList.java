package linkedlist;

public class SinglyLinkedList {
     private ListNode head;
     private int size;


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

     public void insertAt(int index){

     }



};


