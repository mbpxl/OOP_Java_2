package ru.gb.lessons.interfaces;

import mechanisms.*;
import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {

    public static void main(String ... args) {
//        Mechanism auto = new Auto(new ArrayList<>());
//
//        Mechanism mechanism = new Mechanism(new ArrayList<>()) {
//            @Override
//            public void manage() {
//
//            }
//        };
//        Cat homeCat = new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));
//
//        WildCat wildCat = new WildCat(1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));
//
//        homeCat.hunt();
//        wildCat.hunt();
//
//        Dog dog = new Dog();
//        dog.setName("Barbos");

//        System.out.println(homeCat);
//        System.out.println(dog);

//        Some exemplar = new Some();
//        exemplar.wait();
//        System.out.println(exemplar.toString());

//        Animal dog = new Dog();

        AreaCalculable squareArea1 = x -> x[0] * x[0];
        AreaCalculable squareTriangle = arg -> 0.5 * arg[0] * arg[1];

        double[] doubles = new double[]{7, 5};

        System.out.println("Площадь треугольника: " + squareTriangle.calculate(doubles));

    }
}
