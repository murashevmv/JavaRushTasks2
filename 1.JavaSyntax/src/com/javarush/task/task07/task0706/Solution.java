package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = new int [15];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = Integer.parseInt(reader.readLine());
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i%2==0){
                sum2+=temp[i];
            }
            else{
                sum1+=temp[i];
            }
        }
        if (sum1>sum2){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else if(sum1<sum2){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
