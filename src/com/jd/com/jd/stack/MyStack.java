package com.jd.com.jd.stack;

public class MyStack<T> {
    private Object[] stackElem;
    private int size;
    private int top;

    public MyStack(int size) {
        this.size = size;
        stackElem = new Object[size];
    }

    public  void push(T elem){
        if(top > size / 2){
            size *= 2;
            Object[] newStackElem = new Object[size];
            for(int i = 0; i < stackElem.length; i++){
                newStackElem[i] = stackElem[i];
            }
            stackElem = newStackElem;
        }
        stackElem[top++] = elem;
    }

    public T pop(){
        if(top == 0){
            return null;
        }
        T elem = (T)stackElem[--top];
        stackElem[top] = null;
        return elem;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
