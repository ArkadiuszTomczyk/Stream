package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orr = new OrderRequestRetriever();
        StoreRequest sr = orr.retrive();

        ProductOrderService productOrderService = new ProductOrderService(
                 new StoreProcessor(), new OrderMenager(), new SmsService());
        productOrderService.process(sr);

    }
}
