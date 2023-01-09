package org.example;

import java.util.Iterator;

public class MarkinList<E> implements List<E> {
    private E[] values;
    MarkinList() {
        values = (E[]) new Object[0];
    }
    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length); // С какого м, С какого э, В какой м, С какого э, сколько элементов.
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            throw new RuntimeException(exception);
        }

    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[values.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementAfterIndex);
        } catch (ClassCastException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}

