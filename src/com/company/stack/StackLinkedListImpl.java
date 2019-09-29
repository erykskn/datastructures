package com.company.stack;

public class StackLinkedListImpl implements IStack {

    private static int MAX_VALUE_COUNT = 10;
    private static int COUNT_OF_ITEMS = 0;
    StackNode root = null;

    @Override
    public void push(String value) {

        if (COUNT_OF_ITEMS <= MAX_VALUE_COUNT) {
            StackNode stackNode = new StackNode(value);
            if (root == null) {
                root = stackNode;
                root.nextNode = null;
                root.preNode = null;
            } else {
                root.nextNode = stackNode;
                stackNode.preNode = root;
                root = stackNode;
            }
            COUNT_OF_ITEMS++;
            System.out.println("Pushed string data:" + value);
        } else {
            System.out.println("Stack is full!");
        }

    }

    @Override
    public String pop() {
        top();
        return null;
    }

    @Override
    public String top() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Data of top data:" + root.data);
            if (root.preNode != null) {
                StackNode stackNode = root.preNode;
                stackNode.nextNode = null;
                root = stackNode;
            }
            COUNT_OF_ITEMS--;
            System.out.println("Count of stack value:" + COUNT_OF_ITEMS);
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return COUNT_OF_ITEMS == 0 ? true : false;
    }

    @Override
    public boolean isOverflow() {
        return false;
    }


    static class StackNode {
        private StackNode nextNode;
        private StackNode preNode;
        private String data;

        public StackNode(String data) {
            COUNT_OF_ITEMS = 1;
            this.data = data;
        }
    }
}
