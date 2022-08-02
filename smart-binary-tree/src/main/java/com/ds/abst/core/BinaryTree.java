package com.ds.abst.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author varane
 * @created 08/01/2022
 */
@Data
@NoArgsConstructor
public class BinaryTree<T> implements Tree{

    private TreeNode<T> root;

    public BinaryTree(T rootValue){
        this.root = new TreeNode<>(rootValue, null, null);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean getHeight() {
        return false;
    }

    public T getRoot(){
        return null;
    }

    @Override
    public T add(Object value) {
        return null;
    }

    @Override
    public T removeFirst(Object value) {
        return null;
    }

    @Override
    public void removeAll(Object value) {

    }
}
