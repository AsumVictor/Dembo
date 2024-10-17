package running;

import linkedlist.singlyCircularLinkedList.SingleCircularLinkedList;
import solution.Solution;

public class SingleCircularLinkedListRun {

    public static void main(String[] args){
        SingleCircularLinkedList scl = new SingleCircularLinkedList();
        scl.insert(0);
        scl.insert(1);
        scl.insert(2);
        System.out.println(scl.isEmpty());
        scl.printEl();
        Solution s = new Solution();

        System.out.println(s.hasCycle(scl.head));

    }
}


