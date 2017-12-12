package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    private String user = "John";
     StoreRequest sr = new StoreRequest();

    public static void main(String[] args){


        LocalDate buyWhen =LocalDate.of(2017, 08, 08);

        ProductOrderService productOrderService = new ProductOrderService(
                 new StoreService(), new OrderRepository(), new InformationService());
        productOrderService.process(sr);

    }
}
