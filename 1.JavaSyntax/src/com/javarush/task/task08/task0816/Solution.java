package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне0", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("DECEMBER 1 2012"));
        return  map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
//        for (Map.Entry entry:
//                map.entrySet()) {
//            String s = entry.getValue().toString();
            //String key1 = (String) entry.getKey();
            Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Date> pair = iterator.next();
                String s = pair.getValue().toString();
                if (s.indexOf("Jun")>=0 || s.indexOf("Jul")>=0 ||s.indexOf("Aug")>=0){
                   // System.out.println(pair.getKey());
                    iterator.remove();
                    //pair.remove();
                }

            }

            //System.out.println();

 //       }
      /*  for (Date value :
                map.values()) {
            System.out.println(value);
        }*/

    }

    public static void main(String[] args) throws ParseException {
       // Map<String, Date> map1 = createMap();
       // removeAllSummerPeople(map1);


    }
}
