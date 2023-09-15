package mechanisms;

public class C implements A, B {
    @Override
    public void x() {
        C p = new C();
        ((A) p).x();
    }

}
