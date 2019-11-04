package com.company.Queue;

public class Queue {

    private String[] strArray;
    private int head;
    private int rear;
    private int capacity;
    private static int count;

    public Queue(int count) {
        this.strArray = new String[count];
        this.head = 0;
        this.rear = -1;
        this.capacity = count;
        this.count = 0;
    }


    public void enqueue(String data) {

        if (isFull()) {
            System.out.println("Queue is full!");
            System.exit(1);
        }

        System.out.println(String.format("%s added", data));

        rear = (rear + 1) % capacity;
        strArray[rear] = data;
        count++;
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        System.out.println(String.format("Deleting item is %s ", strArray[head]));
        head = (head + 1) % capacity;
        count--;
    }

    public void getHeadItem(){

        if (isEmpty()){
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        System.out.println(String.format("Head item is %s ", strArray[head]));
    }

    public boolean isFull() {
        return (getSize() == capacity);
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public int getSize() {
        return count;
    }
}
