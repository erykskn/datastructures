package com.company.stack;

public interface IStack {
    void push(String value);
    String pop();
    String top();
    boolean isEmpty();
    boolean isOverflow();
}
