package day20200421;

public class Pair<T> {
    private T first;
    private T last;
    public Pair() {
        // Compile error:
//        T first = new T();
//        T last = new T();
    }
}

