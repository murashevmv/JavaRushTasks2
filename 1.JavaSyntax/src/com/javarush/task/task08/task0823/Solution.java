package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();
        StringBuilder res = new StringBuilder(string);
//        int n = string.indexOf(" ");
//        while (n>=0){
//            if()
//            n++;
//        }


        for (int i = 0; i < res.length(); i++) {
            char v = res.charAt(i);
            if (v == ' ') {
                char c = res.charAt(i+1);
                //res.replace(i,i+1,);
                res.setCharAt(i+1,Character.toUpperCase(c));

            }
        }
        res.setCharAt(0,Character.toUpperCase(res.charAt(0)));

        System.out.println(res);
    }
}
