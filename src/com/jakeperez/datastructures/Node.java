package com.jakeperez.datastructures;

public class Node<T> {
    private T item;
    private Node<T> next;

    public Node(T value) {
        this.item = value;
        this.next = null;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return item + " "+ next;
    }
}

