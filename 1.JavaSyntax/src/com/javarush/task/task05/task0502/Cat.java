package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int win = 0;
        int lose = 0;
       if (this.age>anotherCat.age) win+=1;
       else if (this.age<anotherCat.age) lose+=1;
       if (this.strength> anotherCat.strength) win+=1;
       else if (this.strength<anotherCat.strength) lose+=1;
       if (this.weight> anotherCat.weight) win+=1;
       else if (this.weight<anotherCat.weight) lose+=1;

       return (win>lose);

    }

    public static void main(String[] args) {
        boolean result;
        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.strength = 5;
        cat1.weight = 7;

        Cat cat2 = new Cat();
        cat2.age = 10;
        cat2.strength = 5;
        cat2.weight = 7;

        //result = cat1.fight(cat2);
        result = cat2.fight(cat1);
        System.out.println(result);

    }
}
