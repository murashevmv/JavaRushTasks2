package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = new String [10];
        int[] temp2 = new int [10];
        for (int i = 0; i < temp.length ; i++) {
            temp2[i] = reader.readLine().length();
        }
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);
        }
    }
}
