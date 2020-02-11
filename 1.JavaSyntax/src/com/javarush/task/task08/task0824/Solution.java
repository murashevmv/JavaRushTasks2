package com.javarush.task.task08.task0824;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Human child1 = new Human("pit1",2,false);
        Human child2 = new Human("pit2",12,false);
        Human child3 = new Human("pit3",5,true);
        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human mother = new Human("Hater",45,false,childs);
        Human father = new Human("Bred",47,true,childs);

        ArrayList<Human> childs_1 = new ArrayList<Human>();
        childs_1.add(mother);

        ArrayList<Human> childs_2 = new ArrayList<Human>();
        childs_2.add(father);

        Human grandPa = new Human("Fill",98,true,childs_1);
        Human grandMa = new Human("Debra",77,false,childs_1);

        Human grandPa2 = new Human("Fill1",93,true,childs_2);
        Human grandMa2 = new Human("Debra2",91,false,childs_2);

        System.out.println(grandMa);
        System.out.println(grandMa2);
        System.out.println(grandPa);
        System.out.println(grandPa2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
       String name;
       Boolean sex;
       int age;
       ArrayList<Human> children = new ArrayList<>();

       Human(String name, int age, Boolean sex){
           this.name = name;
           this.age = age;
           this.sex = sex;
       }
       Human(String name, int age, Boolean sex, ArrayList<Human> children){
           this.name = name;
           this.age = age;
           this.sex = sex;
           this.children = children;
       }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
