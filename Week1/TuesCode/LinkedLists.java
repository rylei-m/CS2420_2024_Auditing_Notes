private static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this(element, null);
    }

    public Node(E element, Node<E> n) {
        private Node<E> head, tail;
        private int size;
    }
}

public state class LinkedzList {
    private Node<E> head, tail;
    private int size;
}

// To add a new node to the end of a list keeping in mind that a linked list cal be empty to start
public void insert(E item) {
    if(tail == null){
        tail = new Node<>(item);
        head = tail
    } else {
        tail.next = new Node<>(item);
        tail = tail.next;
    }
}

// For removing x from a given linked list and reassigning the node pointer previous to x to the node after x
public noolean removeItem (F item) {
    Node<E> prev, curr;
    prev = curr = null;
    for (curr = head;
         curr !=null && curr.element.compareTo(item) != 0;
         curr = curr.next)
        prev = curr;

    if (curr = null)
        return false;

    if (prev == null)
        head = head.next;
    else prev.next = curr.next;

    if (curr == tail)
        tail = prev;
    size--;
    return true
}