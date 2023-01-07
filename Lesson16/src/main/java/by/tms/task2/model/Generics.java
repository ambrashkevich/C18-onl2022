package by.tms.task2.model;

import java.io.Serializable;

public class Generics<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Generics(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public String className() {
        return String.format(t.getClass().getName(), v.getClass().getName(), k.getClass().getName());
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
