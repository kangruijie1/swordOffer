package com.jd.swordOffer;

public class T30 {
    public static void main(String[] args) {
        int[] nums = {-2,-8,-1,-5,-9};
        System.out.println(new T30().FindGreatestSumOfSubArray(nums));
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            if(sum > max){
                max = sum;
            }
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}