package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int [20];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = Integer.parseInt(reader.readLine());
        }
        return temp;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max>array[i] ? max : array[i];
        }
        return max;
    }
}
