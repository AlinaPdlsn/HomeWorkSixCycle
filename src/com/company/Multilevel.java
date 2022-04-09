package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multilevel {
    public static void main(String[] args) {
        int[][] score = {
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33}
        };
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int summ = 0;
            for (int j = 0; j < score[i].length; j++) {
                result[i] += score[i][j];
            }
        }

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    public static void summ() {
        int[][] score = {
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33}
        };

        int[] result = new int[score.length];

        result[0] = score[0][0] + score[0][1] + score[0][2] + score[0][3];
        result[1] = score[1][0] + score[1][1] + score[1][2] + score[1][3];
        result[2] = score[2][0] + score[2][1] + score[2][2] + score[2][3];
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);

    }

}