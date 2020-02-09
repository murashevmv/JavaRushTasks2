package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
       Map<String,String> map =new HashMap<>();
       map.put("Fred0","XXX");
       map.put("Fred1","XXX_1");
       map.put("Fred2","XXX_2");
       map.put("Fred3","XXX");
       map.put("Fred4","XXX");
       map.put("Fred5","XXX_4");
       map.put("Fred6","XXX");
       map.put("Fred7","XXX_3");
       map.put("Fred8","XXX");
       map.put("Fred9","XXX");
       return  map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy_0 = new HashMap<>(map);
        //System.out.println(map.equals(copy));
        for (Map.Entry<String, String> pair_0 : copy_0.entrySet()) {
            Map<String, String> copy_1 = new HashMap<>(map);
            for (Map.Entry<String, String> pair_1 : copy_1.entrySet()) {
                if(pair_1.getKey().equals(pair_0.getKey())) continue;

                if (pair_1.getValue().equals(pair_0.getValue())) {
                    //map.remove(pair_1.getKey());
                    removeItemFromMapByValue(map,pair_1.getValue());
                }

            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
      /*  Map<String, String> map1 = createMap();
        removeTheFirstNameDuplicates(map1);
        for (Map.Entry<String, String> pair : map1.entrySet()) {
            System.out.println(pair.getKey());
        }*/


    }
}
