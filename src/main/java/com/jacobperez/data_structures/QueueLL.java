package com.jacobperez.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueLL<T> implements Iterable<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int count = 0;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return count;
    }

    public void enqueue(T value) {
        if (isEmpty()) {
            head = new Node<>(value);
            tail = head;
        } else {
            Node<T> newTail = new Node<>(value);
            tail.setNext(newTail);
            tail = newTail;
        }
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty Queue");
        }
        T item = head.getItem();
        head = head.getNext();
        count--;
        return item;
    }

    public Iterator<T> iterator() {
        return new QueueLLIterator();
    }

    private class QueueLLIterator implements Iterator<T> {
        private Node<T> current = head;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in Queue");
            }
            T item = current.getItem();
            current = current.getNext();
            return item;
        }
    }

}
