package by.tms.task2.model;

public class Atelier {
    private Clothing[] clothing;

    public Atelier(Clothing[] clothing) {
        this.clothing = clothing;
    }

    public void dressMan() {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof IMensClothing) {
                ((IMensClothing) clothing1).dressMan();
            }
        }
    }

    public void dressWomen() {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof IWomensClothing) {
                ((IWomensClothing) clothing1).dressWomen();
            }
        }
    }
}
