package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        int b = number(reader.readLine());
        if (a>0 && b>0) {
            System.out.println(1);
        } else if (a<0 && b>0) {
            System.out.println(2);
        } else if (a<0 && b<0) {
            System.out.println(3);
        } else if (a>0 && b<0) {
            System.out.println(4);
        }

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}