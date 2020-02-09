package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        int b = number(reader.readLine());
        int c = number(reader.readLine());
        if ((a+b)<=c||(a+c)<=b||(b+c)<=a){
            System.out.println("Треугольник не существует.");
        }
        else {
            System.out.println("Треугольник существует.");
        }

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }

}