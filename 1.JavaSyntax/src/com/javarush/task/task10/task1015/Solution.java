/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //ArrayList<String>[] arrayLists = new ArrayList[3];
        ArrayList<String>[] arrayLists = new ArrayList[2];
        arrayLists[0] = new ArrayList<String> (Arrays.asList ("Мас1Строка1", "Мас1Строка2")); // и т.д. мож
        arrayLists[1] = new ArrayList<String> (Arrays.asList ("Мас1Строка1", "Мас1Строка2")); // и т.д. мож

//        ArrayList<String> tempStrings = new ArrayList<>();
//        tempStrings.add("Иван");
//        tempStrings.add("Маша");
//        arrayLists[0] = tempStrings;
//        ArrayList<String> tempStrings1 = new ArrayList<>();
//        tempStrings.add("Иван1");
//        tempStrings.add("Маша1");
//        arrayLists[1] = tempStrings1;
//        ArrayList<String> tempStrings2 = new ArrayList<>();
//        tempStrings.add("Иван2");
//        tempStrings.add("Машша1");
//        arrayLists[2] = tempStrings2;


        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}