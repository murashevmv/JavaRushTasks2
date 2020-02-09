package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        int b = number(reader.readLine());
        int c = number(reader.readLine());
        if (a==b){
            if (a==c){
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println(a+" "+b);
            }
        }
        else if (b==c){
            if (b==a){
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println(b+" "+c);
            }
        }
          else if (c==a){
            if (c==b){
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println(c+" "+a);
            }
        }

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}