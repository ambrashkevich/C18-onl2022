package tms.example;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class Cashier {
    private String cashDeskName;
    private ReentrantLock lock;

    public Cashier(String cashDeskName) {
        this.cashDeskName = cashDeskName;
        lock = new ReentrantLock();
    }

    public Cashier() {
    }

    private String getCashDeskName() {
        return this.cashDeskName;
    }

    ReentrantLock getLock() {
        return lock;
    }

    String getProduct(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int item = random.nextInt(buyer.getProductType().size());
        lock.lock();
        try {

            for (; item < buyer.getProductType().size(); item++) {

                if (item != buyer.getProductType().size()) {
                    result.append(buyer.getProductType().get(item)).append(", ");
                } else {
                    result.append(buyer.getProductType().get(item));
                }
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return "Покупатель " + buyer.getName() + " купил: \n" + result + " в " + this.getCashDeskName();
    }
}
