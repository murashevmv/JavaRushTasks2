package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5, 35.01));
        System.out.println(convertEurToUsd(7, 28.33));

    }

    public static double convertEurToUsd(int eur, double course) {
        double v = eur * course;
        return v;

    }
}
