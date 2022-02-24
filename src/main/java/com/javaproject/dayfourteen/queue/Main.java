package com.javaproject.dayfourteen.queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Queue Program");
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
//        Adding the Elements
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);

//        Deleting the Element
        myQueue.deQueue();

//        Printing the Stack
        myQueue.print();
    }
}
