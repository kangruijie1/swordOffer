package com.jd.swordOffer;

import com.jd.linked.ListNode;
import com.jd.linked.SingleLinkedList;

import java.util.Stack;

/**
 * 链表反转
 */
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
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    /**
     * 用栈
     */
   /* public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Stack stack = new Stack();
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode currentNode = head;

        while(!stack.empty()){
            currentNode.next = (ListNode) stack.pop();
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;
    }*/


    /*
     *新链表头插法
     */
    /*public static ListNode ReverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            if (newHead == null) {
                newHead = new ListNode(head.val);
            } else {
                ListNode node = new ListNode(head.val);
                node.next = newHead;

                newHead = node;
            }
            head = head.next;
        }
        return newHead;
    }*/

    /**
     * 递归法 前缀
     * @param head
     * @return
     */
    /*public static ListNode ReverseList(ListNode head,ListNode pre) {
        if(head == null || head.next == null){
            head.next=pre;
            return head;
        }
        ListNode next=head.next;
        head.next = pre;

        //A->B->c
        //null<-A
        return ReverseList(next,head);
    }

    public static ListNode ReverseList(ListNode head) {
        return ReverseList(head,null);
    }*/

    public static ListNode ReverseList(ListNode head) {
        if(head.next == null || head == null){
            return head;
        }

        ListNode listNode = ReverseList(head);

        head.next.next = head;
        head.next = null;

        return listNode;
    }

}
