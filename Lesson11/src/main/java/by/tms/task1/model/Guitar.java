package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Guitar implements IInstrument {
    private int string;

    public Guitar(int string) {
        this.string = string;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, с кол-вом струн" + " " + getString() + " ");
    }
}
