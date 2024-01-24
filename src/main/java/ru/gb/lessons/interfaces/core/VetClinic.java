package ru.gb.lessons.interfaces.core;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    public static void main(String[] args) {
        Human human = new Human("Oleg");
        Cat cat = new Cat(1, "wakey", 1, LocalDate.of(2022, 11, 1), new Owner("Oleg"));
        animals.add(cat);

        for(Animals element: animals) {
            heal(element);
        }
    }

    private static void heal(Animals patient) {
        System.out.println(patient.getClassName() + " вылечен");
    }
}
