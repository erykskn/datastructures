package com.company;

import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {

        lifoStackInit();

    }
    private static void lifoStackInit(){
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
