package com.javaproject.dayfourteen.stack;

public class MyStack<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyStack() {
        this.head = null;
        this.tail = null;
    }

    public void push(INode<K> newNode) {
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }
        else{
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
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

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
}