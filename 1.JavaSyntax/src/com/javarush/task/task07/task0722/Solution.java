package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String name = reader.readLine();
             if (name.equals("end")) {
              break;
            }
            list.add(name);
        }

        for (int i = 0; i <list.size() ; i++) {
            //list.add(reader.readLine());
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}