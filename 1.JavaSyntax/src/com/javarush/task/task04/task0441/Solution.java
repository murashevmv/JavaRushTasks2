package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = number(reader.readLine());
        int b = number(reader.readLine());
        int c = number(reader.readLine());

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(a);
        numbersList.add(b);
        numbersList.add(c);
        Collections.sort(numbersList);
        System.out.println(numbersList.get(1));


    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}
