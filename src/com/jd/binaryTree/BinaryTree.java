package com.jd.binaryTree;


import java.util.Stack;

public class BinaryTree {
    TreeNode root;

    //得到树的深度
    public Integer getHeight(){
        return getHeight(root);
    }

    private Integer getHeight(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int left = getHeight(node.getLeftChildTree());
            int right = getHeight(node.getRightChildTree());
            return left > right ? left + 1 : right + 1;
        }
    }

    //得到节点数量
    public Integer getSize(){
        return getSize(root);
    }

    private Integer getSize(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int leftSize = getSize(node.getLeftChildTree());
            int rightSize = getSize(node.getRightChildTree());
            return leftSize + rightSize + 1;
        }
    }

    //前序遍历
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            System.out.println("preOrder" + node.getData());
            preOrder(node.getLeftChildTree());
            preOrder(node.getRightChildTree());
        }
    }

    //中序遍历
    public void midOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            midOrder(node.getLeftChildTree());
            System.out.println("midOrder" + node.getData());
            midOrder(node.getRightChildTree());
        }
    }

    //后序遍历
    public void posOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            posOrder(node.getLeftChildTree());
            posOrder(node.getRightChildTree());
            System.out.println("posOrder" + node.getData());
        }
    }

    public BinaryTree() {
        root=new TreeNode("A");
        TreeNode nodeB=new TreeNode("B");
        TreeNode nodeC=new TreeNode("C");
        TreeNode nodeD=new TreeNode("D");
        TreeNode nodeE=new TreeNode("E");
        TreeNode nodeF=new TreeNode("F");
        nodeB.setLeftChildTree(nodeD);
        nodeB.setRightChildTree(nodeE);
        nodeC.setRightChildTree(nodeF);
        root.setLeftChildTree(nodeB);
        root.setRightChildTree(nodeC);
    }

    //前序栈遍历
    public void preOrderStack(TreeNode node){
        if(node == null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            System.out.println("preOrderStack" + pop.getData());
            if(pop.getRightChildTree() != null){
                stack.push(pop.getRightChildTree());
            }
            if(pop.getLeftChildTree() != null){
                stack.push(pop.getLeftChildTree());
            }
        }
    }
}
