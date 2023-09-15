package mechanisms;

public interface Rideable { //способный ездить
//    public static final double pi = 3.1415926;

    void ride();

    default double some() {
        return 5.0;
    }
}
