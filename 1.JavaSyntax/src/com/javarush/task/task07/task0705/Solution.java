package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int [20];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = Integer.parseInt(reader.readLine());
        }
        int[] temp1 = new int [10];
        int[] temp2 = new int [10];
        for (int i = 0; i < temp.length; i++) {
            if (i>9){
                //System.out.println(i-10);
                temp2[i-10]=temp[i];
            }
            else{
                temp1[i]=temp[i];
            }

        }
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);
        }
    }
}
