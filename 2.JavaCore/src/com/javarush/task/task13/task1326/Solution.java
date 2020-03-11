/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String strLine;
        ArrayList<Integer> numbers = new ArrayList<>();
        while ((strLine = br.readLine()) != null){
            int j = Integer.parseInt(strLine);
            if(j%2==0) numbers.add(j);
           // System.out.println(strLine);
        }
        Collections.sort(numbers);
        for (int j :
                numbers) {
            System.out.println(j);
        }


//        FileInputStream fstream = new FileInputStream("C:/file.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
//        String strLine;
//        while (inStream.available() > 0)
//        {
//            System.out.println((char) inStream.read());
//            inStream.
         //   char ch = (char)inStream.read();
          //  int i = (int) ch;
           // if(i%2==0) numbers.add(i);
      //  }
//        Collections.sort(numbers);
//        for (int j :
//                numbers) {
//            System.out.println(j);
//        }
//C:/temp/123.txt
        inStream.close();
        reader.close();

    }
}
