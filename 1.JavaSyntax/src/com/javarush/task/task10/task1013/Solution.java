/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private boolean sex;
        private String name;
        private Human father;
        private Human mother;
        private Human child;

        public Human(int age){
            this.age = age;
        }

        public Human(int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }
        public Human(int age, boolean sex, String name){
            this.age = age;
            this.sex = sex;
            this.name = name;
        }
        public Human(int age, boolean sex, String name, Human father){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.father = father;
        }
        public Human(int age, boolean sex, String name, Human father, Human mother){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        public Human(int age, boolean sex, String name, Human father, Human mother, Human child){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        public Human(int age, boolean sex, Human mother,  String name,Human child){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.mother = mother;
            this.child = child;
        }
        public Human(int age,  String name) {
            this.age = age;
            this.name = name;
        }
        public  Human(int age, boolean sex, Human mother, Human child, String name){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.mother = mother;
            this.child = child;
        }
        public Human(boolean sex, Human mother, Human child, String name, int age){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.mother = mother;
            this.child = child;
        }

    }
}
