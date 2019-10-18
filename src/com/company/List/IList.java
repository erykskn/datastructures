package com.company.List;

public interface IList {
    String next();
    String previous();
    void add(String data);
    void delete(int index);
    void printListItems();
}
