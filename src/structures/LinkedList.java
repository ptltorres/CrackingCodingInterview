package structures;

public class LinkedList<T> {
    //TODO Update the removeFirst() and removeLast(). Check the output from main().

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }

        size++;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node<T> removeFirst() {
        Node<T> temp = first;
        first = first.next;
        size--;
        return temp;
    }

    public Node<T> removeLast() {
        Node<T> temp = last;
        last = last.previous;
        // last.next = null ??
        size--;
        return temp;
    }

    public void removeAll() {
        first = null;
    }

    // remove(item)
    public T remove(T item) {
        Node<T> temp = getNode(item);

        if (temp != null) {
            if (temp == first)
                removeFirst();
            else if (temp == last)
                removeLast();
            else
                temp.previous = temp.next;

            return temp.data;
        }

        return null;
    }

    private Node<T> getNode(T item) {
        Node<T> current = first;

        while (current != null) {
            if (current.data.equals(item)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    // get(item)
    public T get(T item) {
        Node<T> current = first;

        while (current != null) {
            if (current.data.equals(item)) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node<T> current = first;

        while (current != null) {
            System.out.print(current + " -> ");
            current = current.next;
        }
    }

    public void displayReverse() {
        Node<T> current = last;

        while (current != null) {
            System.out.print(current + " -> ");
            current = current.previous;
        }
    }
}
