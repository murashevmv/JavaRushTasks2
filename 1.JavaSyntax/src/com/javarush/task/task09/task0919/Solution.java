package com.javarush.task.task09.task0919;
import java.lang.Exception;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() throws Exception{
        System.out.println(5/0);
//        try {
//            sot
//            int a = 5/0;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }


    }
}
