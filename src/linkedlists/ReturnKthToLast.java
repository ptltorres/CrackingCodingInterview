package linkedlists;

import structures.LinkedList;
import structures.Node;

public class ReturnKthToLast {

    public static void execute() {
        LinkedList<Integer> linkedNumbers = new LinkedList<>();
        int kth = 3;

        linkedNumbers.addLast(10);
        linkedNumbers.addLast(20);
        linkedNumbers.addLast(30);
        linkedNumbers.addLast(40);
        linkedNumbers.addLast(50);
        linkedNumbers.addLast(60);
        linkedNumbers.addLast(80);
        linkedNumbers.addLast(90);
        linkedNumbers.addLast(100);

       // System.out.println("The " + kth + "th to last element is " + getKthLast(linkedNumbers, kth));
    }
    /*
    public static <T> Node<T> getKthLast(LinkedList<T> list, int kth) {
        int count = 0;
        Node<T> current = list.getFirst();

        while (current != null) {
            count++;

            if (count == list.getSize() - kth + 1)
                break;

            current = current.next;
        }

        return current;
    }*/
}
