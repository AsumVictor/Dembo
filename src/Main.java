import linkedlist.SinglyLinkedList;

class Main{
    public static void main(String args[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(4);
        sll.insert(5);
        sll.insert(6);
        sll.insert(7);
        sll.insert(8);
         sll.insertInSorted(99);
        System.out.println(sll.toString());
    }
}