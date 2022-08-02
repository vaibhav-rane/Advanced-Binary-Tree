package com.ds.abst.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

/**
 * @author varane
 * @created 08/01/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode<T> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    @Override
    public String toString() {
        return new StringJoiner(", ", TreeNode.class.getSimpleName() + "[", "]")
                .add("value=" + value)
                .add("left=" + left)
                .add("right=" + right)
                .toString();
    }
}
