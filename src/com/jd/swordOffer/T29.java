package com.jd.swordOffer;

import java.util.ArrayList;

public class T29 {
    public static void main(String[] args) {
        int[] nums = {4,5,1,6,2,7,3,8};
        System.out.println(new T29().GetLeastNumbers_Solution(nums, 4));
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length){
            return list;
        }
        for(int i = 0; i < k; i++){
            for(int j = 0; j < input.length - 1 - i; j++){
                if(input[j] < input[j + 1]){
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            list.add(input[input.length - 1 - i]);
        }
        return list;
    }
}
