package com.company;

import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {

        lifoStackInit();
        System.out.println("-----------");
        reverseCharactersOfStringToStack();

    }

    private static void reverseCharactersOfStringToStack() {

        String string = "HelloWorld";
        Stack stack = new Stack();

        for (int index = 0; index < string.length(); index++) {
            stack.push(String.valueOf(string.charAt(index)));
        }
        System.out.println("-----------");

        while (!stack.isEmpty()) {
            stack.pop();
        }

    }

    private static void lifoStackInit() {
        System.out.println("--cleLIFO Stack--");
        Stack stack = new Stack();
        String hello = "HELLO";
        stack.push(hello);
        String world = "WORLD";
        stack.push(world);
        stack.pop();
        stack.pop();
        stack.pop();
    }

}
