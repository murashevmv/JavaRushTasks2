package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
      //  System.out.println(inStream.readAllBytes());
       // inStream.
        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read());
           // inStream.readAllBytes().toString();

        }
//C:/temp/123.txt
        inStream.close();
        reader.close();
    }
}