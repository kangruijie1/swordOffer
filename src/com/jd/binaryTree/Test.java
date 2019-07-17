package com.jd.binaryTree;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.preOrder(bt.root);
        bt.midOrder(bt.root);
        bt.posOrder(bt.root);
        bt.preOrderStack(bt.root);
    }
}
