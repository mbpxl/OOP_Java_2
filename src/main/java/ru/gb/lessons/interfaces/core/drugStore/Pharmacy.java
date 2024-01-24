package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> componentList;
    private int index;

    public Pharmacy() {
        this.componentList = new ArrayList<>();
        this.index = 0;
    }

    public Pharmacy addComponent(Component component) {
        this.componentList.add(component);
        return this;
    }

    @Override
    public boolean hasNext() { // есть ли следующий
        return index < componentList.size();
    }

    @Override
    public Component next() { // ссылка на следующий элемент
        return componentList.get(index++);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "componentList=" + componentList +
                ", index=" + index +
                '}';
    }
}
