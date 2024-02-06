public class Node<T> {
    T item;
    Node<T> next;
    Node<T> prev;

    public Node(T item, Node<T> prev, Node<T> next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }
}