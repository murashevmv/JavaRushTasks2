package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        int a = number(inputString);
        String s1;
        String s2 = stringType(inputString);

        if(a%2 == 0) s1 = "четное";
        else s1 = "нечетное";

        if (a>=1 && a<=999) System.out.println(s1+" "+s2+" число");

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }

    public  static String stringType(String s){
        int lengthString = s.length();
        if (lengthString==1) return "однозначное";
        else if (lengthString==2) return "двузначное";
        else if (lengthString==3) return "трехзначное";
        else return "";
    }
}
