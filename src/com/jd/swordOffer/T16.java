package com.jd.swordOffer;

import com.jd.linked.ListNode;
import com.jd.linked.SingleLinkedList;

import java.util.List;

public class T16 {
    public static void main(String[] args) {
        SingleLinkedList instance = new SingleLinkedList();
        instance.addNodeInTail(1);
        instance.addNodeInTail(3);
        instance.addNodeInTail(5);
        instance.addNodeInTail(7);
        instance.addNodeInTail(9);
        ListNode head1 = instance.getHead();

        SingleLinkedList instance2 = new SingleLinkedList();
        instance2.addNodeInTail(2);
        instance2.addNodeInTail(4);
        instance2.addNodeInTail(6);
        instance2.addNodeInTail(8);
        instance2.addNodeInTail(10);
        ListNode head2 = instance2.getHead();


        ListNode merge = Merge(head1, head2);
        while(merge != null){
            System.out.println(merge.val);
            merge = merge.next;
        }
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return  list1;
        }

        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode newList = newHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newList.next = list1;
                list1 = list1.next;
            } else {
                newList.next = list2;
                list2 = list2.next;
            }
            newList = newList.next;
        }
        if (list1 != null) {
            newList.next = list1;
        }
        if (list2 != null) {
            newList.next = list2;
        }
        return newHead.next;
    }
}
