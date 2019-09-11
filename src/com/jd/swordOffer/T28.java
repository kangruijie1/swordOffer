package com.jd.swordOffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
public class T28 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2, 6, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 4};
        System.out.println(new T28().MoreThanHalfNum_Solution(nums));
    }

    /* public int MoreThanHalfNum_Solution(int [] array) {
         int[] tempArr = new int[array.length];
         for(int i = 0; i < array.length; i++){
             tempArr[i] = array[i];
         }

         for(int i = 0; i < tempArr.length; i++){
             if(tempArr[i] == 0){
                 continue;
             }

             for(int j = i + 1; j < tempArr.length; j++){
                 if(tempArr[i] != tempArr[j] && tempArr[j] != 0){
                     tempArr[i] = 0;
                     tempArr[j] = 0;
                     break;
                 }
             }
         }

         int result = 0;
         for(int num : tempArr){
             if(num != 0){
                 result = num;
                 break;
             }
         }

         int count = 0;
         for(int num : array){
             if(num == result){
                 count++;
             }
         }

         if(count * 2 <= array.length){
             result = 0;
         }

         return result;
     }*/
    public int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                Integer value = map.get(num);
                map.put(num, ++value);
            }
        }

        for (Map.Entry<Integer, Integer> entry :  map.entrySet()) {
            if (entry.getValue() * 2 > array.length) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
