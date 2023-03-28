package tms.example;

import java.util.List;

class Buyer extends Thread {

    private final List<Cashier> cashiers;
    private final List<ProductType> productTypes;

    Buyer(String name, List<Cashier> cashiers, List<ProductType> productTypes) {
        super(name);
        this.cashiers = cashiers;
        this.productTypes = productTypes;
    }

    List<ProductType> getProductType() {
        return this.productTypes;
    }

    @Override
    public void run() {
        Cashier chosenCashDesk = cashiers.get(0);
        do {
            for (Cashier cashDesk : cashiers) {
                if (cashDesk.getLock().getQueueLength() < chosenCashDesk.getLock().getQueueLength()) {
                    chosenCashDesk = cashDesk;
                    break;
                }
            }
            System.out.println(chosenCashDesk.getProduct(this));
        } while (!this.isAlive());
    }
}
