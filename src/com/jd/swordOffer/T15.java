package com.jd.swordOffer;

import com.jd.com.jd.stack.MyStack;
import com.jd.linked.ListNode;
import com.jd.linked.SingleLinkedList;

public class T15 {
    public static void main(String[] args) {
        SingleLinkedList instance = new SingleLinkedList();
        instance.addNodeInTail(7);
        instance.addNodeInTail(8);
        instance.addNodeInTail(9);
        instance.addNodeInTail(10);
        instance.addNodeInTail(11);
        ListNode head = instance.getHead();
        ListNode listNode = ReverseList(head);
        System.out.println(listNode.val);
    }

    public static ListNode ReverseList(ListNode head) {
        MyStack myStack = new MyStack(8);
        while (head.next != null) {
            myStack.push(head.val);
            head = head.next;
        }

        ListNode currentNode = head;

        int top = myStack.getTop();
        for (int i = 0; i < top; i++) {
            currentNode.val = (Integer) myStack.pop();
            currentNode = currentNode.next;
        }

        return head;
    }
}
