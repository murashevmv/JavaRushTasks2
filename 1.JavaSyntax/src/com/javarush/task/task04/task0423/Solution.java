package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int years = 20;
        int a;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        a = number(reader.readLine());
        if (a>years) System.out.println("И 18-ти достаточно");

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
