package com.jd.swordOffer;

import com.jd.linked.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class T14 {
    public static void main(String[] args) {

    }
    public class Solution {
        public ListNode FindKthToTail(ListNode head, int k) {
            if(k <= 0){
                return null;
            }
            ListNode p,q;
            p = q = head;
            int i = 0;
            for(; p != null; i++){
                if(i >= k){
                    q = q.next;
                }
                p = p.next;
            }
            return i < k ? null : q;
        }
    }
}
