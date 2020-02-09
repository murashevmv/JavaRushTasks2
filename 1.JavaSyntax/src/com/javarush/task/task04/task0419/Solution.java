package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = number(reader.readLine());
            int b = number(reader.readLine());
            int c = number(reader.readLine());
            int d = number(reader.readLine());
            System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));

        }
        public static int number(String s){
            return Integer.parseInt(s);
        }
}
