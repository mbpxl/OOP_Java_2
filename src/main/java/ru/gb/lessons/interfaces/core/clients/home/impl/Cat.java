package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;
import java.util.List;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet {


    public Cat() {
    }


    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }


}
