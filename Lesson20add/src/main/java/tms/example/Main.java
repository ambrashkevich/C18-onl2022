package tms.example;

//**
// * Напишите программу, моделирующую кассы в магазине.
// * Существует несколько касс, работающих одновременно.
// * Каждый покупатель — отдельный поток.
// * Общее количество покупателей может быть больше, чем количество касс,
// * но одновременно не может обрабатываться больше покупателей, чем имеется рабочих касс.
// * У каждого покупателя есть набор товаров, которые должны быть выведены на консоль в процессе обслуживания.
// */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Основной поток стартанул");
        try {
            List<Cashier> cashiers = IntStream.range(0, 5)
                                              .boxed()
                                              .map(x -> new Cashier("Кассе №" + x))
                                              .toList();

            for (int i = 1; i <= 20; i++) {
                Buyer buyer = new Buyer("\t" + "Number " + i,
                                        cashiers, Arrays.stream(ProductType.values()).toList());
                buyer.start();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage() + " error has occurred");
        }
    }
}
