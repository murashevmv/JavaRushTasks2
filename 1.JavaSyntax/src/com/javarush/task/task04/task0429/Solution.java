package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int count1, count2;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        for (int i = 0; i <3 ; i++) {
            a = number(reader.readLine());
            if (a>0) count1+=1;
            else if (a<0) count2+=1;
        }
        System.out.println("количество отрицательных чисел: "+count2);
        System.out.println("количество положительных чисел: "+count1);



    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
