package com.company.stack;

public class StackArrayImpl implements IStack {

    private static int MAX_STACK_COUNT = 50;
    private String[] stackOfObject = new String[MAX_STACK_COUNT];
    private static int sequenceOfTopObject;

    public StackArrayImpl() {
        sequenceOfTopObject = -1;
    }

    @Override
    public void push(String object) {
        if (object == null) {
            System.out.println("Object is null, so object not added!");
        }else if (isOverflow()){
            System.out.println("Stack  overflow!");
        } else{
            sequenceOfTopObject++;
            stackOfObject[sequenceOfTopObject] = object;
            System.out.println("Object: " + object + " added!");
        }
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            String object = stackOfObject[sequenceOfTopObject];
            sequenceOfTopObject--;
            System.out.println("Object: " + object + " popped!");
            return object;
        }
        System.out.println("Stack is empty!");
        return null;
    }

    @Override
    public String top() {
        if (!isEmpty()) {
            return stackOfObject[sequenceOfTopObject];
        }
        System.out.println("Stack is empty!");
        return null;
    }

    @Override
    public boolean isEmpty() {
        return sequenceOfTopObject < 0;
    }

    @Override
    public boolean isOverflow() {
        return sequenceOfTopObject > MAX_STACK_COUNT;
    }
}
