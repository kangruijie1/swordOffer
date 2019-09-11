package com.jd.swordOffer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class T19 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
        };

        System.out.println(printMatrix(matrix).toString());
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> nums = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        if (right == 0) {
            for (int i = 0, j = up; j <= down; j++) {
                nums.add(matrix[j][i]);
            }
            return nums;
        }
        if (down == 0) {
            for (int i = left, j = 0; i <= right; i++) {
                nums.add(matrix[j][i]);
            }
            return nums;
        }
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                nums.add(matrix[up][i]);
            }
            for (int j = up + 1; j <= down; j++) {
                nums.add(matrix[j][right]);
            }
            for (int i = right - 1; down != up && i >= left; i--) {
                nums.add(matrix[down][i]);
            }
            for (int j = down - 1; left != right && j >= up + 1; j--) {
                nums.add(matrix[j][left]);
            }

            right--;
            left++;
            up++;
            down--;
        }
        return nums;
    }
}
