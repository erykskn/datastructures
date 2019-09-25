package com.company.stack;

public interface IStack {
    void push(String object);
    String pop();
    String top();
    boolean isEmpty();
    boolean isOverflow();
}
