package by.tms.model;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("i7-9900", "HyperX 64GB", "WD Blue 2TB", 3);
        System.out.println(computer);
        while (computer.getResource() > 0) {
            computer.on();
        }


    }
}

