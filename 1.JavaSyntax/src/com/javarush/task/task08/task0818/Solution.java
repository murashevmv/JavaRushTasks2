package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anna0",501);
        map.put("Anna1",50);
        map.put("Anna2",300);
        map.put("Anna3",800);
        map.put("Anna4",505);
        map.put("Anna5",500);
        map.put("Anna6",255);
        map.put("Anna7",900);
        map.put("Anna8",555);
        map.put("Anna9",777);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            if (pair.getValue()<500) iterator.remove();
        }

    }

    public static void main(String[] args) {
//       Map<String,Integer> map1 = createMap();
//       removeItemFromMap(map1);
//        for (Integer value :
//                map1.values()) {
//            System.out.println(value);
//        }

    }
}