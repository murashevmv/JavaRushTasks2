/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task13.task1319;

/*
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(reader.readLine()))) {
//            while (true) {
//                s = reader.readLine();
//                bw.write(s);
//                bw.newLine();
//                if (s.equals("exit")) break;
//            }
//            bw.close();
//
//        } catch (IOException ex) {
//
//            System.out.println(ex.getMessage());
//        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(reader.readLine()));
            while (true) {
                s = reader.readLine();
                bw.write(s);
                bw.newLine();
                if (s.equals("exit")) break;
            }
            bw.close();


    }
}
