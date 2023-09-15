package mechanisms;

import java.util.List;

public class Auto extends Mechanism implements Rideable, Turnable {
    public Auto(List<Detail> details) {
        super(details);
    }

    @Override
    public void manage() {
        System.out.println("Завел и поехал");
    }

    @Override
    public void ride() {
        System.out.println("Поехали");
    }

    @Override
    public void turnOn() {
        System.out.println("Старт");
    }

    @Override
    public void turnOff() {
        System.out.println("Стоп");
    }
//
//    @Override
//    public double some() {
//        return 25;
//    }
}
