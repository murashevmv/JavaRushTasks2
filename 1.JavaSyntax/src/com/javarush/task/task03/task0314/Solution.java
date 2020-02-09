package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        String s;
        for (int i=1;i<=10;i++){
            s="";
            for (int j=i;j<=10*i;j++){
                s = s+j+"";
            }
            System.out.println(s);
        }

    }
}
