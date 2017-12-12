package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    private String user = "John";
     StoreRequest sr = new StoreRequest("jan", 2017);

    public static void main(String[] args){

        LocalDate buyWhen =LocalDate.of(2017, 8, 1);
        OrderRequestRetriever orr = new OrderRequestRetriever();
        StoreRequest sr = orr.retrive();

        ProductOrderService productOrderService = new ProductOrderService(
                 new StoreService(), new OrderRepository(), new InformationService());
        productOrderService.process(sr);

    }
}
