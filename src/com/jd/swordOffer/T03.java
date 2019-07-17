package com.jd.swordOffer;

import com.jd.linked.ListNode;
import com.jd.linked.SingleLinkedList;

import java.util.ArrayList;

public class T03 {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNodeInHead(5);
        singleLinkedList.addNodeInHead(4);
        singleLinkedList.addNodeInHead(3);
        singleLinkedList.addNodeInHead(2);
        singleLinkedList.addNodeInHead(1);

        System.out.println(printListFromTailToHead(singleLinkedList.getHead()).toString());;
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!= null){
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}
