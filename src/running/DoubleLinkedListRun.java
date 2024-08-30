package running;

import linkedlist.DoubleLinkedList.DoubleLinkedList;

public class DoubleLinkedListRun {

    public static void main(String[] arg){

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertBack(-1);
        dll.insertBack(0);
        dll.insertBack(1);
        dll.insertBack(3);
        dll.insertBack(4);
        dll.insertBack(5);
        dll.insertBack(6);
        dll.insertBack(8);
        dll.insertBack(9);
        dll.insertNthFront(3,2);
        dll.insertNthBack(2,7);
        dll.deleteEnd();
        dll.deleteStart();
        dll.deleteStartIndex(8);
        dll.printForward();
        dll.printBackward();

    }
}
