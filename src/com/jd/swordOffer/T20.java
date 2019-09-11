package com.jd.swordOffer;

import java.util.Arrays;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class T20 {
    int size = 0;
    int min = Integer.MAX_VALUE;
    Integer[] elements = new Integer[10];
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int node) {
        ensureCapacity(size + 1);
        elements[size++] = node;
        if(node < min){
            stack.push(node);
            min = node;
        }
    }

    public void ensureCapacity(int size){
        int len = elements.length;
        if(size > len){
            int newLen = (len * 3) / 2 + 1;
            elements = Arrays.copyOf(elements,newLen);
        }
    }

    public void pop() {
        Integer top = top();
        if(top != null){
            if(top <= min){
                stack.pop();
                min = stack.peek();
            }
            elements[size--] = null;
        }
    }

    public Integer top() {
        if(!empty()){
            return elements[size-1];
        }
        return null;
    }

    public int min() {
        return min;
    }

    public boolean empty(){
        return size == 0;
    }

    public static void main(String[] args) {
        T20 t20 = new T20();

        t20.push(3);
        t20.push(4);
        t20.push(2);
        t20.push(3);
        t20.pop();

        t20.pop();
        t20.pop();

    }
}