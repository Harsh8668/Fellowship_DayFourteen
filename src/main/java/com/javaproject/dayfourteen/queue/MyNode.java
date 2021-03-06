package com.javaproject.dayfourteen.queue;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode<K> next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}