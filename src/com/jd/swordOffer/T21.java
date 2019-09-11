package com.jd.swordOffer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class T21 {
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 3, 5, 1, 2};
        System.out.println(new T21().IsPopOrder(pushA, popA));
    }

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int push : pushA) {
            stack.push(push);
            while (!stack.isEmpty() && stack.peek() == popA[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

    /*public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int j = 0, i = 0; j < popA.length; j++) {
            boolean isFind = false;
            while (true) {
                if (!stack.isEmpty() && stack.peek() == popA[j]) {
                    stack.pop();
                    isFind = true;
                    break;
                }
                if(i == pushA.length){
                    break;
                }
                stack.push(pushA[i++]);
            }
            if (isFind) {
                continue;
            }
            return false;
        }
        return true;
    }*/
}
