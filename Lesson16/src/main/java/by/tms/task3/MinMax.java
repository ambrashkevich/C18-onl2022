package by.tms.task3;

import java.util.Arrays;
import java.util.Objects;

public class MinMax<T extends Number> {

    private T[] arrayOfNumbers;

    public MinMax(T[] array) {
        Objects.requireNonNull(array);
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        this.arrayOfNumbers = array;
    }

    public T getMax() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[0];
    }

    public T[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }
}



