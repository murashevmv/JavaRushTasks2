package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int [10];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = temp.length-1; i >= 0; i--) {
            System.out.println(temp[i]);
        }

    }
}

