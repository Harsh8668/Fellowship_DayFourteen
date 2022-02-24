package com.javaproject.dayfourteen.stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack Program");
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
//        Adding the Elements to the top
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

//        Deleting the Element from the top
        myStack.pop();

//        Printing the Stack
        myStack.print();
    }
}
