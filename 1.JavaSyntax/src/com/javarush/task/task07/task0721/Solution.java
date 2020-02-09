package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<Integer> list = new ArrayList<Integer>();
        int [] arrayNumber = new int[20];
       // Array[20] int
        for (int i = 0; i < 20; i++) {
            //list.add(Integer.parseInt(reader.readLine()));
            arrayNumber[i]=Integer.parseInt(reader.readLine());
        }

        int maximum = arrayNumber[0];
        int minimum = arrayNumber[0];

        for (int numb:
                arrayNumber) {
            minimum = Math.min(minimum,numb);
            maximum = Math.max(maximum,numb);
        }

//        for (int i = 0; i < 20; i++) {
//            list.add(Integer.parseInt(reader.readLine()));
//        }



        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
