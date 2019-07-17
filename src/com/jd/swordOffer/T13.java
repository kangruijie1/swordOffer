package com.jd.swordOffer;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class T13 {
    public static void main(String[] args) {
        int[] nums = {1, 8, 2, 7, 9, 3, 4, 6, 2, 5};
        reOrderArray((nums));
        System.out.println(Arrays.toString(nums));
    }

    //冒泡
    /*public static void reOrderArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = array.length - 1; j > i; j--){
                if(array[j-1] % 2 == 0 && array[j] % 2 != 0){
                    int c;
                    c = array[j-1];
                    array[j-1] = array[j];
                    array[j] = c;
                }
            }
        }
    }*/
    //插入
   /* public static void reOrderArray(int[] array){
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                int j = i;
                while(j > k){
                    int c;
                    c = array[j];
                    array[j] = array[j-1];
                    array[j-1] = c;
                    j--;
                }
                k++;
            }
        }
    }*/
   //正宗插入
    public static void reOrderArray(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            if(array[i] % 2 == 1){
                int j = i;
                while(j - 1 >= 0 && array[j-1] % 2 == 0){
                    array[j] = array[j-1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }
    //新建数组
    /*public static void reOrderArray(int[] array){
        int[] newArray = new int[array.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                array[oddIndex++] = array[i];
            }else {
                newArray[evenIndex++] = array[i];
            }
        }
        for (int i = 0; i < evenIndex; i++){
            array[oddIndex++] = newArray[i];
        }
    }*/
}
