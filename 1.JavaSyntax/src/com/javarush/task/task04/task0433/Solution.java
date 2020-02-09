package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int i = 10, j;
        String s;
        while (i>0){
            s="";
            j = 10;
            while (j>0){
                s = s+"S";
                j--;
            }
            System.out.println(s);
            i--;
        }


    }
}
