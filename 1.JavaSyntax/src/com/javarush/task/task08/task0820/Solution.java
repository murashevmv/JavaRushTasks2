package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<>();
        for (Dog v :
                dogs) {
            result.add(v);

        }
        for (Cat g :
                cats) {
            result.add(g);
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat v :
                cats) {
            pets.remove(v);
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object o :
                pets) {
            System.out.println(o);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}
