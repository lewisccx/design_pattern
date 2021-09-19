package com.designpatterns.iterator.solution;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();
}
