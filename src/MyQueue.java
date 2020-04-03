public class MyQueue<E> {
    private Node head;
    private Node tail;
    private int numNodes;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void enQueue(E element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
            return;
        }
        tail.next = new Node(element);
        tail = tail.next;
    }

    public E dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return (E) temp.object;
    }

    public class Node {
        private Node next;
        private Object object;

        public Node(Object object) {
            this.object = object;
        }
    }
}
