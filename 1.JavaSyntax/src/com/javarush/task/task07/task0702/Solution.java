package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = new String [10];
        for (int i = 0; i < temp.length-2 ; i++) {
            temp[i] = reader.readLine();
        }
        for (int i = temp.length-1; i >= 0; i--) {
            System.out.println(temp[i]);
        }
    }
}