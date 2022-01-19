package com.company;

import com.company.animals.Cat;
import com.company.animals.Horse;
import com.company.animals.Koala;
import com.company.doors.SlidingDoor;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat", 5, 7, "black");
        Cat cat2 = new Cat("Cat", 5, 7, "black");
        Horse horse = new Horse("Horse1", 500, 10, 20);
        Koala koala = new Koala("Koala1", 10, 5);
        System.out.println(cat1);
        cat1.makeSound();
        System.out.println(cat2);
        System.out.println("First cat equals to second cat?: " + cat1.equals(cat2));
        System.out.println(horse);
        horse.eat();
        System.out.println(koala);
        koala.sleep();




    }
}

