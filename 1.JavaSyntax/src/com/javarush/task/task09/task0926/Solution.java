package com.javarush.task.task09.task0926;

import java.sql.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> tempArray = new ArrayList<>();
        int[] a = {0,1,2,3,4};
        int[] b = {0,1};
        int[] c = {0,1,2,3};
        int[] d = {0,1,2,3,4,5,6};
        int[] e = {};
        tempArray.add(a);
        tempArray.add(b);
        tempArray.add(c);
        tempArray.add(d);
        tempArray.add(e);


//        for (int i = 0; i < 5; i++) {
//            tempArray.add();
//        }


        return tempArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
