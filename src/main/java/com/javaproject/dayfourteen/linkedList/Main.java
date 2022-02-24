package com.javaproject.dayfourteen.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Program");
        MyLinkedList myLinkedList = new MyLinkedList();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);

//        Adding the Node
        myLinkedList.add(myFirstNode);
//
//        Appending the Node
        myLinkedList.append(myThirdNode);
//
//        Inserting the Node
        myLinkedList.insert(myFirstNode,mySecondNode);
//
//        Deleting the Node from the Head
//        myLinkedList.delete();

//        Deleting the Node from the tail
//        myLinkedList.deleteTail();

//        Searching the Node
        myLinkedList.search(30);

//        Inserting the Node after Second Node
        myLinkedList.insertAfter(mySecondNode, myFourthNode);

//        Deleting the Node by Position
        myLinkedList.deleteNode(myFirstNode,2);

//        Printing the Nodes
        myLinkedList.print();
    }
}
