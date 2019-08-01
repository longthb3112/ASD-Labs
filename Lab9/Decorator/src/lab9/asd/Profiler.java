package lab9.asd;

public interface Profiler<E> {
    boolean add(E e);
    boolean remove(Object o);
    boolean contains(Object o);
    int size();
}
