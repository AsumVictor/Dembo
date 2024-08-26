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
        sll.insertAt(2,3);
        sll.insertAt(0,0);
       sll.deleteIndex(7);


//        sll.toString();

        sll.insertAt(2,30);
        sll.insertAt(0,4);
        System.out.println(sll.toString());
        sll.reverse();
        System.out.println("-----------------");
        System.out.println(sll.toString());
        System.out.println(sll.nthFromEnd(4));
    }
}