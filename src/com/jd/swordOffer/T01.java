package com.jd.swordOffer;

import java.util.Scanner;

/*在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。*/

public class T01 {
    public static void main(String[] args) {
       int[][] array = {{5, 8, 11, 13}, {6, 9, 15, 22}, {7, 16, 19, 25}};
        System.out.println(find(6, array));
    }
    public static boolean find(int target, int [][] array) {
        int i = 0;
        int j = array[i].length - 1;
        while(i < array.length && j > -1){
            if(array[i][j] > target){
                j--;
            }else if(array[i][j] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
