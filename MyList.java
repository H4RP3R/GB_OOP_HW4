public interface MyList<T> extends Iterable<T> {
    void add(T element);

    void addFirst(T element);

    void addLast(T element);

    int size();

    T get(int index);
}