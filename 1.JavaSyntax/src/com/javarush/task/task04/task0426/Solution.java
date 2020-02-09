package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        String s1;
        String s2 = "";
        if(a%2 == 0) s1 = "четное";
        else s1 = "нечетное";

        if (a>0) s2 = "положительное";
        else if(a<0) s2 = "отрицательное";

        if (a==0) System.out.println("ноль");
        else{
            System.out.println(s2+" "+s1+" число");
        }


    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
