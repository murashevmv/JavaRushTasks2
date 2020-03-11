/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
//        Hen hen = HenFactory.getHen(Country.BELARUS);
//        hen.getCountOfEggsPerMonth();
        Hen hen = HenFactory.getHen(Country.RUSSIA);
      //  System.out.println(hen.getDescription()+"Моя страна - "+Country.RUSSIA+" Я несу "+hen.getCountOfEggsPerMonth()+" яиц в месяц.");
        System.out.println(hen.getDescription());
        Hen hen1 = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen1.getDescription());
//        System.out.println(hen1.getDescription()+"Моя страна - "+Country.BELARUS+" Я несу "+hen1.getCountOfEggsPerMonth()+" яиц в месяц.");
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen2.getDescription());
//        System.out.println(hen.getDescription()+"Моя страна - "+Country.MOLDOVA+" Я несу "+hen2.getCountOfEggsPerMonth()+" яиц в месяц.");
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen3.getDescription());
//        System.out.println(hen.getDescription()+"Моя страна - "+Country.UKRAINE+" Я несу "+hen3.getCountOfEggsPerMonth()+" яиц в месяц.");
      //  hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country==Country.RUSSIA){
                hen = new RussianHen();
            }
            if (country==Country.BELARUS){
                hen = new BelarusianHen();
            }
            if (country==Country.MOLDOVA){
                hen = new MoldovanHen();
            }
            if (country==Country.UKRAINE){
                hen = new UkrainianHen();
            }
            return hen;
        }
    }


}
