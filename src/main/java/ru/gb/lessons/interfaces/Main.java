package ru.gb.lessons.interfaces;

import mechanisms.*;
import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;
import ru.gb.lessons.interfaces.core.drugStore.Component;
import ru.gb.lessons.interfaces.core.drugStore.Pharmacy;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
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

    public static void main(String[] args) {
        Cat homeCat = new Cat(2, "Tom", 4, LocalDate.of(2022, 4, 13), new Owner("Petka"));

        Dog homeDog = new Dog(1, "Barbos", 4, LocalDate.of(2022, 5, 12), new Owner("Vasya"));

        System.out.println(homeCat);
        System.out.println(homeDog);

        // {LESSON 3}

        Pharmacy pharmacy = new Pharmacy();
        Component component = new Component("Penicilin", "10 mg", 10);
        Component component1 = new Component("Spirit", "100 g", 4);

        pharmacy.addComponent(component).addComponent(component1);

        while (((Iterator<Component>) pharmacy).hasNext()) {
            System.out.println(pharmacy.next());
        }

    }
}
