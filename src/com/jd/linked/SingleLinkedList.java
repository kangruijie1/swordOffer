package com.jd.linked;

public class SingleLinkedList {
    private int size;
    private ListNode head;
    private ListNode tail;

    public int getSize() {
        return size;
    }

    public ListNode getHead() {
        return head;
    }

    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    public void addNodeInHead(int  val){
        ListNode newNode = new ListNode(val);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;

            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addNodeInTail(int val){
        ListNode newNode = new ListNode(val);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void deleteNodeIndHead(){
        head = head.next;
        size--;
    }
}
