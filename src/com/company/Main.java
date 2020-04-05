package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        for (int i = 0; )
//        do{
        //          me.pet.takeForAWalk();
        //     }while (me.pet.imDead());
        Car passat = new Car("Volkswagen", "Passat", 1984, 1.9, "Red", 100000.0);
        me.setSalary(20000.0);
        me.setCar(passat);

        Human John = new Human();
        John.setSalary(15000.0);
        John.pet = new Animal("dog");
        John.firstName = "John";
        John.lastName = "Smith";
        John.setCar(passat);

        System.out.println(me.getCar());
        System.out.println(John.getCar());

        System.out.println(me);
        System.out.println(me.species);
        me.feed();

        me.pet.beEaten();
//        me.beEaten();

//        me.sell();
        passat.sell();
        me.pet.sell();
    }
}