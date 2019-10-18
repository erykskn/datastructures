package com.company.List;

public class LinkedList implements IList {

    private static int SIZE_OF_LIST = 0;
    public Node root;

    public LinkedList(Node rootNode) {
        this.root = rootNode;
        SIZE_OF_LIST = 1;
    }

    @Override
    public String next() {

        if (root.next == null) throw new NullPointerException("Not finded next node!");

        String data = root.data;
        root = root.next;
        return data;
    }

    @Override
    public String previous() {

        if (root.pre == null)
            throw new NullPointerException("Not finded previous node! \n LinkedList is emtpy or only has root node!");

        String data = root.data;
        root = root.pre;
        return data;
    }

    @Override
    public void add(String data) {
        root.INDEX++;
        SIZE_OF_LIST++;
        Node newNode = new Node(data);
        root.next = newNode;
        newNode.pre = root;
        root = newNode;
        System.out.println(String.format("%s added!", data));

    }

    @Override
    public void delete(int index) {
        Node rootNode = root;

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index of item less than zero! \n Item not deleted!");
        } else if (index > SIZE_OF_LIST) {
            throw new ArrayIndexOutOfBoundsException("Index of item grather than size of list! \n Item not deleted!");
        } else if (index + 1 == SIZE_OF_LIST) {
            Node node = root.pre;
            root.pre.next = null;
            root = node;

        } else {
            for (int a = 0; a < SIZE_OF_LIST - index - 1; a++) {
                root = root.pre;
            }
            root.pre.next = root.next;
            root.next.pre = root.pre;
            root = rootNode;
        }

        SIZE_OF_LIST--;
    }

    @Override
    public void printListItems() {
        while (root != null) {
            System.out.println(String.format("Data : %s", root.data));
            root = root.pre;
        }
    }

}
