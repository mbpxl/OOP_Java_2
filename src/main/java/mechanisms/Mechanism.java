package mechanisms;

import java.util.List;

public abstract class Mechanism {
    private List<Detail> details;

    public Mechanism(List<Detail> details) {
        this.details = details;
    }

    public abstract void manage();

    void x(int a){}

    void x(long a){}
}
