package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s;
        int a;
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        a = number(reader.readLine());

        while (i<a){
            System.out.println(s);
            i++;
        }



    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
