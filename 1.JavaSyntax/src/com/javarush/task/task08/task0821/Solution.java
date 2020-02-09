package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Васильева","Люда1");
        map.put("Васильева1","Люда");
        map.put("Васильева2","Люда2");
        map.put("Васильева3","Люда");
        map.put("Васильева4","Люда");
        map.put("Васильева5","Люда3");
        map.put("Васильева6","Люда");
        map.put("Васильева7","Люда4");
        map.put("Васильева8","Люда");
        map.put("Васильева","Люда5");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
