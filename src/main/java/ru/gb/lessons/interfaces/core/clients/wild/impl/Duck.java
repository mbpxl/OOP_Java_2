package ru.gb.lessons.interfaces.core.clients.wild.impl;

import org.w3c.dom.ls.LSOutput;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скорость: 122 км/ч");
        return 122;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "бежит со скоростью 298 км/ч");
        return 298;
    }
}
