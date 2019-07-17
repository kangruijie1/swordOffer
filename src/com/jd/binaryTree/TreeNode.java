package com.jd.binaryTree;

public class TreeNode<T> {
    private Integer index;
    private TreeNode leftChildTree;
    private TreeNode rightChildTree;
    private T data;


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public TreeNode getLeftChildTree() {
        return leftChildTree;
    }

    public void setLeftChildTree(TreeNode leftChildTree) {
        this.leftChildTree = leftChildTree;
    }

    public TreeNode getRightChildTree() {
        return rightChildTree;
    }

    public void setRightChildTree(TreeNode rightChildTree) {
        this.rightChildTree = rightChildTree;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
