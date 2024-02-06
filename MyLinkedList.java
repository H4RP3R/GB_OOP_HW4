import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    private void addToEmpty(T element) {
        Node<T> node = new Node<T>(element, null, null);
        this.first = node;
        this.last = node;
    }

    @Override
    public void add(T element) {
        if (this.size == 0) {
            addToEmpty(element);
        } else {
            Node<T> node = new Node<T>(element, last, null);
            this.last.next = node;
            this.last = node;
        }

        this.size++;
    }

    @Override
    public void addLast(T element) {
        add(element);
    }

    @Override
    public void addFirst(T element) {
        if (this.size == 0) {
            addToEmpty(element);
        } else {
            Node<T> node = new Node<T>(element, null, first);
            this.first.prev = node;
            this.first = node;
        }

        this.size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= this.size) {
            String exMsg = String.format("Index: %d, Size: %d", index, this.size);
            throw new IndexOutOfBoundsException(exMsg);
        }
        Node<T> node = this.first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return get(index++);
            }
        };
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (var item : this) {
            sb.append(item);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length(), "]");
        return sb.toString();
    }
}
