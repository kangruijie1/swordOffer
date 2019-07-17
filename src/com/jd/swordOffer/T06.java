package com.jd.swordOffer;

import java.util.Arrays;

public class T06 {
    public static void main(String[] args) {
        int[] array = {9, 11 , 14, 34, 65, 7};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int mid = 0;
        int start = 0;
        int end = array.length - 1;
        while (end - start != 1){
            mid = (start + end) / 2;

            if(array[start] == array[end] && array[start] == array[mid]){
                Arrays.sort(array);
                return array[0];
            }
            if (array[mid] >= array[start]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return array[start] > array[end] ? array[end] : array[start];
    }
}