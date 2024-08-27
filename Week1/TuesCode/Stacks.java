class Stack {
    private class Node {
        int data;
        Node next;
        public Node(int x, Node next) {
            this.data = x;
            this.next = next;
        }
    }
    node top;

    Stack() {
        this.top = null;

        public void push(int x)
        {
            // Adding a new node to the top of a stack
            top = new Node(x, top)
        }
        public boolean isempty() {
            // Case is there is no proir top node when addin to a stack
            return top == null
        }
    }
}

// To be generic
class Stack {
    private class Node <E> {
        E data;
        Node next;
        public Node(E x, Node next) {
            this.data = x;
            this.next = next;
        }
    }
    node<E> top;

    Stack(E none) {
        this.top = null;
        this.Nonde = none
    }
}

public int peek() {
    if (top != null) {
        return top.data
    } else {
        System.out.println("Stack is empty");
        return -999
    }
}

// Removes from he beginning
// Unfinished
public int pop() {
    if (top == null) {
        System.out.println("Stack UnderFlow");
        return -9999;
}

    // String Builder
public String toString(String label) {
    StringBuildeer sb = new StringBuilder();
    sb.append(label);
    if (top == null) {
        sb.append("\nStack Empty")
    } else {
        Node temp = top;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next
                    if (temp != null)
                        sb.append(" -> ")
        }
    }
    return sb.toString();
}


    public static void main(String[] args) {
    Stack = new Stack();
    s.push(11);
    s.push(22);
    s.push(33);
    s.push(44);
    System.out.println(s.toString("Stack")
    System.out.printf("\nTop Element is %d\n", s.peek()));
    s.pop();
    s.opo();
    System.out.printf("\nTop element is %d\n, s.peek()"));

    }
}