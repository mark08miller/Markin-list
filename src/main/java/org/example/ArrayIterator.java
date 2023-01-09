package org.example;

public class ArrayIterator<E> implements Iterator<E>, java.util.Iterator<E> {
    private int index = 0;
    E[] values;

    public ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        if (index < values.length) {
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        return values[index++];
    }

    @Override
    public void remove() {
        java.util.Iterator.super.remove();
    }
}
