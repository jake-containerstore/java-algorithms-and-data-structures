package com.jakeperez.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Creates a generic stack using a linked list like structure.
 * @param <T>
 */
public class StackLL<T> implements Iterable<T>{
    Node<T> head = null;
    private int count = 0;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        Node<T> newHead = new Node<>(item);
        newHead.setNext(head);
        head = newHead;
        count++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T item = head.getItem();
        head = head.getNext();
        count--;
        return item;
    }


    @Override
    public Iterator<T> iterator() {
        return new StackLLIterator();
    }

    private class StackLLIterator implements Iterator<T> {
        Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more items in StackLL");
            }
            T item = current.getItem();
            current = current.getNext();
            return item;
        }
    }
}
