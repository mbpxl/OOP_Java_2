package mechanisms;

import java.util.List;

public class Micro extends Mechanism implements Cookable, Turnable {

    public Micro(List<Detail> details) {
        super(details);
    }

    @Override
    public void manage() {
        // тут описываем конкретную реализацию логики
        System.out.println("Нажал кнопку. Подогрел суп");
    }

    @Override
    public void сook() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
