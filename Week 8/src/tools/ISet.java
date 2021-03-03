package tools;

public interface ISet<T> {
    boolean add(T obj);

    void clear();

    boolean contains(T obj);

    boolean isEmpty();

    boolean remove(T obj);

    int size();
}
