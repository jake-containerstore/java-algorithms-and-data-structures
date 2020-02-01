package com.jakeperez.datastructures;

public class LinkedList<T> {
    private Node<T> head = null;
    private int count = 0;

    public void add(T value) {
       Node<T> newNode = new Node<>(value);
       newNode.setNext(head);
       head = newNode;
       count++;
    }

    public Node<T> getHead() {
        return head;
    }

    public T pop() throws Exception {
        try {
            if (head != null) {
                T value = head.getItem();
                head = head.getNext();
                count--;
                return value;
            } else {
                throw new Exception("Empty linked list");
            }
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }


}
