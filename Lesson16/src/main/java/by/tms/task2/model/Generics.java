package by.tms.task2.model;

import java.io.Serializable;

public class Generics<T extends Comparable, V extends Animal & Serializable, K extends Number> {

    private T taType;
    private V vaType;
    private K kaType;

    public Generics(T t, V v, K k) {
        this.taType = t;
        this.vaType = v;
        this.kaType = k;
    }

    public String className() {
        return String.format(taType.getClass().getName(), vaType.getClass().getName(), kaType.getClass().getName());
    }

    public T getTaType() {
        return taType;
    }

    public V getVaType() {
        return vaType;
    }

    public K getKaType() {
        return kaType;
    }
}
