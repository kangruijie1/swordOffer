package com.jd.swordOffer;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(RectCover(target));
    }

    public static int RectCover(int target) {
        if(target <= 0) {
            return 0;
        }else if(target <= 2){
            return target;
        }else{
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}
