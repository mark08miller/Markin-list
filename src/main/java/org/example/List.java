package org.example;

public interface List<E> {
    boolean add(E e);
    void delete();
    E get(int index);
    int size();
    void update(int index, E e);
}
