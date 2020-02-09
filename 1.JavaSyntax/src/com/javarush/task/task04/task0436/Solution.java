package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int m,n;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        m = number(reader.readLine());
        n = number(reader.readLine());
        for (int i = 0; i < m; i++) {
            s = "";
            for (int j = 0; j < n; j++) {
                s+="8";
            }
            System.out.println(s);
        }

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
