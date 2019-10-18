package com.company.List;

public class Node {
    String data;
    Node next;
    Node pre;
    static int INDEX = -1;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.pre = null;
        this.INDEX++;
    }
}