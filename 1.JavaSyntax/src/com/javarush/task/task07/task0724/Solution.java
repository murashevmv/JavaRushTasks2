package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Дима",true,98);
        Human grandPa2 = new Human("Сережа",true,90);
        Human grandMa1 = new Human("Аня",false,95);
        Human grandMa2 = new Human("Наташа",false,75);
        Human mother = new Human("Света",false,41,grandPa1,grandMa1);
        Human father = new Human("Андрей",true,40,grandPa2,grandMa2);
        Human child1 = new Human("Андрей",true,8,father,mother);
        Human child2 = new Human("Лена",false,13,father,mother);
        Human child3 = new Human("Паша",true,10,father,mother);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       Human father;
       Human mother;

       Human(String name, boolean sex, int age){
           this.name = name;
           this.sex = sex;
           this.age = age;
       }

       Human(String name, boolean sex, int age, Human father, Human mother){
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.father = father;
           this.mother = mother;
       }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}