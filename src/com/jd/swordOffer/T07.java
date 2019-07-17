package com.jd.swordOffer;

public class T07 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(9));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int one = 0;
        int two = 1;
        int temp = 0;
        for(int a = 2; a <= n; a++){
            temp = one + two;
            one = two;
            two = temp;
        }
        return temp;
    }
}
