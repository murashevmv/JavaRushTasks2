package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

//        InputStream fileInputStream = getOutputStream(destinationFileName);
//        InputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
         //   System.out.println(fileInputStream.available());
            fileOutputStream.write(data);
            count++;
        }
//        for (int i = 0; i<fileInputStream.available(); i++)
//        {
//            System.out.println(fileInputStream.available());
//            int data = fileInputStream.read();
//            fileOutputStream.write(data);
//            count++;
//        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();


//        int count = 0;
////     //   System.out.println(fileInputStream);
////        while (fileInputStream.available() > 0) ;
////     //   fileInputStream.
////        {
////            int data = fileInputStream.read();
////            fileOutputStream.write(data);
////            count++;
////         //   System.out.println("Скопировано байт " + count);
////        }
//        int data = fileInputStream.read();
//        char content;
//        while(data != -1) {
//            // переводим байты в символ
//            content = (char) data;
//            data = fileInputStream.read();
//            count++;
//            // fileOutputStream.
//            // выводим полученный символ
//            //    System.out.print(content);
//
//            // читаем следующий байты символа
//
//        }
//        fileOutputStream.write(data);
//
////        if (fileInputStream.available() > 0){
////            fileOutputStream.write(fileInputStream);
////        }


    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
