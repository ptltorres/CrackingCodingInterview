package structures;

import java.util.EmptyStackException;

public class Stack<T> {

    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    public void push(T item) {
        linkedList.addLast(item);
    }

    public Node<T> pop() throws EmptyStackException {
        Node<T> top = peek();
        linkedList.removeLast();
        return top;
    }

    public Node<T> peek() {
        Node<T> top = linkedList.getLast();

        if (top == null) {
            throw new EmptyStackException();
        } else {
            return top;
        }
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
