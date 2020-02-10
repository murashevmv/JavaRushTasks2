package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat  cat :
                cats) {
            cats.remove(cat);
            break;
        }



        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat  cat :
                cats) {
            System.out.println(cat);
            //break;
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
