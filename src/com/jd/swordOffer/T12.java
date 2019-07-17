package com.jd.swordOffer;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();
        System.out.println(Power(base, exponent));
    }

    public static double Power(double base, int n) {
        double res = 1, curr = base;
        int exponent = 0;

        if (n > 0) {
            exponent = n;
        } else if (n < 0) {
            if (base == 0) {
                throw new RuntimeException();
            } else {
                exponent = -n;
            }
        } else{
            return 1;
        }
        while(exponent != 0){
            if((exponent & 1) == 1){
                res *= curr;
            }
            curr *= curr;
            exponent>>= 1;
        }
        return n >= 0 ? res : (1/res);
    }
}
