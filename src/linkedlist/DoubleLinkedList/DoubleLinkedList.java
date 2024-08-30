package linkedlist.DoubleLinkedList;

public class DoubleLinkedList {

    public DoubleListNode head;
    public DoubleListNode tail;
    private int size = 0;

     public int length(){
         return size;
     }

     public boolean isEmpty(){
         return size == 0;
     }

     public void insertForward(int data){
         DoubleListNode newNode = new DoubleListNode(data);
         if(isEmpty()){
             head = newNode;
             tail = head;
             size++;

             return;
         }

         head.prev = newNode;
         newNode.next = head;
         head = newNode;
         size++;

         return;

     }

    public void insertBack(int data){
        DoubleListNode newNode = new DoubleListNode(data);
        if(isEmpty()){
            head = newNode;
            tail = head;
            size++;

            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        return;
    }

    public void printForward(){

         DoubleListNode currNode = head;
         String result = " ";
         while(currNode != null){
             result += "[" + currNode.data + "]" + "--->";
             currNode = currNode.next;
         }

        System.out.println(result);

    }

    public void printBackward(){
        DoubleListNode currNode = tail;
        String result = " ";
        while(currNode != null){
            result += "[" + currNode.data + "]" + "--->";
            currNode = currNode.prev;
        }

        System.out.println(result);


    }

    public void insertNthFront(int index, int data){
         if(index <0 || index > size) return;

         int counter = 0;
         DoubleListNode prev = head;
         DoubleListNode currNode = head;
         DoubleListNode newNode = new DoubleListNode(data);

         while(counter != index){
             prev = currNode;
             currNode = currNode.next;
             counter++;
         }

         prev.next = newNode;
         newNode.next = currNode;

         currNode.prev = newNode;
         newNode.prev = prev;
         size++;

    }

    public void insertNthBack(int index, int data){
        if(index <0 || index > size) return;

        int counter = 0;
        DoubleListNode prev = tail;
        DoubleListNode currNode = tail;
        DoubleListNode newNode = new DoubleListNode(data);

        while(counter != index){
            prev = currNode;
            currNode = currNode.prev;
            counter++;
        }

        prev.prev = newNode;
        newNode.prev = currNode;

        currNode.next = newNode;
        newNode.next = prev;
        size++;

    }

    public void deleteEnd(){
         DoubleListNode currNode = tail.prev;
         currNode.next = null;
         tail = currNode;
         size--;
    }

    public void deleteStart(){
        DoubleListNode currNode = head.next;
        currNode.prev = null;
        head = currNode;
        size--;
    }

    public void deleteStartIndex(int index){
         if(index <=0 || index > size) return;
         if(index == 1){
             deleteStart();
             return;
         }
         if(index == size){
             deleteEnd();
             return;
         }
         DoubleListNode currNode = head;
         int counter = 1;

         while(counter != index){
             currNode = currNode.next;
             counter++;
         }

         DoubleListNode prevNode = currNode.prev;
         DoubleListNode nextNode = currNode.next;

         prevNode.next = nextNode;
         nextNode.prev = prevNode;

    }

}
