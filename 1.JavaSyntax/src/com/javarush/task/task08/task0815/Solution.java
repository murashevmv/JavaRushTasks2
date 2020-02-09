package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Путров1","Сергец1");
        map.put("Путров2","Сергец2");
        map.put("Путров3","Сергец3");
        map.put("Путров4","Сергец4");
        map.put("Путров5","Сергец5");
        map.put("Путров6","Сергец");
        map.put("Путров7","Сергец");
        map.put("Путров32","Сергец");
        map.put("Путров11","Сергец");
        map.put("Путров","Сергец");
        return  map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countNames = 0;
        for (String value :
                map.values()) {
            if (value.equals(name)) countNames++;
        }
        return  countNames;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastNames =0;
        for (String key :
                map.keySet()) {
            if (key.equals(lastName)) countLastNames++;

        }
        return  countLastNames;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
