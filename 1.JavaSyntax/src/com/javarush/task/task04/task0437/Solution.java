package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        String s = "";
        for (int i = 1; i <= 10; i++) {
            s="";
            for (int j = 0; j < i; j++) {
                s+="8";
            }
            System.out.println(s);

        }

    }
}
