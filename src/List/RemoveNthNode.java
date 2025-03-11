package List;


import Utils.LinkedList;
import Utils.LinkedListNode;

public class RemoveNthNode {

    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {

        // Replace this placeholder return statement with your code
        LinkedListNode r=head,l=head;

        while(n > 0){
            r=r.next;
            n--;
        }
        if(r == null ){
            head =head.next;
        }else {
            while (r.next != null) {
                r = r.next;
                l = l.next;
            }
            l.next = l.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {23, 89, 10, 5, 67, 39, 70,28},
                {34, 53, 6, 95, 38, 28, 17, 63, 16, 76},
                {288, 224, 275, 390, 4, 383, 330, 60, 193},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {69, 8, 49, 106, 116, 112, 104, 129, 39, 14, 27, 12}
        };

        int[] n = {4, 1, 6, 9, 11};

        for (int i = 0; i < inputs.length; i++) {
            LinkedList< Integer > inputLinkedList = new LinkedList < Integer > ();
            inputLinkedList.createLinkedList(inputs[i]);
            System.out.print((i + 1) + ".\tLinked List:\t\t");
            inputLinkedList.printListWithForwardArrow();
            System.out.print("\n\tn = " + n[i]);
            System.out.print("\n\tUpdated Linked List:\t");
            removeNthLastNode(inputLinkedList.head, n[i]);
            inputLinkedList.printListWithForwardArrow();
            System.out.println();
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}

