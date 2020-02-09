package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a=0, i=0;
        float n, sum =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            a = number(reader.readLine());
            if (a==-1) break;
            sum+=a;
            i+=1;
        }
        if (sum == 0) System.out.println(sum);
        else{
            n = sum/i;
            System.out.println(n);
        }

    }
    public static int number(String s){
        return Integer.parseInt(s);
    }
}

