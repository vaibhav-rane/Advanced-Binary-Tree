package com.ds.abst.core;

/**
 * @author varane
 * @created 08/01/2022
 */
public interface Tree<T> {
    boolean isEmpty();
    boolean getHeight();
    T add(T value);
    T removeFirst(T value);
    void removeAll(T value);
}
