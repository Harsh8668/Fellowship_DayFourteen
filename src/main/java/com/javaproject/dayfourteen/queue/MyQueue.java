package com.javaproject.dayfourteen.queue;

public class MyQueue<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(INode<K> newNode) {
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void print(){
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode<K> tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public INode<K> deQueue() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
}
