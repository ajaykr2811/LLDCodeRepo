package designPattern.Prototype;

public interface Prototype<T,V> {
    void register(V batch,T student);
    T get(V batch);
    T clone(V batch);
}
