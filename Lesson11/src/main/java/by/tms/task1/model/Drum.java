package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Drum implements IInstrument {

    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, с размером +" + getSize() + " ");
    }
}
