package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        int b = number(reader.readLine());
        if (a>b) System.out.println(b);
        else if (a<b) System.out.println(a);
        else System.out.println(a);

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}