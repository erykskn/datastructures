package com.company;

import com.company.stack.StackArrayImpl;
import com.company.stack.StackLinkedListImpl;

public class Main {

    public static void main(String[] args) {

        lifoStackInit();
        System.out.println("-----------");
        reverseCharactersOfStringToStack();

        System.out.println("-----------");
        StackLinkedListImpl stackLinkedList = new StackLinkedListImpl();
        stackLinkedList.push("eray");
        stackLinkedList.push("keskin");
        stackLinkedList.top();
        stackLinkedList.top();
        stackLinkedList.top();
        System.out.println("Stack is empty? : "+stackLinkedList.isEmpty());


    }

    private static void reverseCharactersOfStringToStack() {

        String string = "HelloWorld";
        StackArrayImpl stackArrayImpl = new StackArrayImpl();

        for (int index = 0; index < string.length(); index++) {
            stackArrayImpl.push(String.valueOf(string.charAt(index)));
        }
        System.out.println("-----------");

        while (!stackArrayImpl.isEmpty()) {
            stackArrayImpl.pop();
        }

    }

    private static void lifoStackInit() {
        System.out.println("--cleLIFO Stack--");
        StackArrayImpl stackArrayImpl = new StackArrayImpl();
        String hello = "HELLO";
        stackArrayImpl.push(hello);
        String world = "WORLD";
        stackArrayImpl.push(world);
        stackArrayImpl.pop();
        stackArrayImpl.pop();
        stackArrayImpl.pop();
    }

}
