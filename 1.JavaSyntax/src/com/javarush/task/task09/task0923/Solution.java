package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            if (isVowel(c)){
                if (c != ' '){
                    s1+=String.valueOf(c);
                    s1+=" ";
                }
            }
            else {
                if (c != ' '){
                    s2+=String.valueOf(c);
                    s2+=" ";
                }
            }
        }
        System.out.println(s1);
        System.out.println(s2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}