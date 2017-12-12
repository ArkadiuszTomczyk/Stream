package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    public String user("John")
    public static void main(String[] args){


        LocalDate buyWhen =LocalDate.of(2017, 08, 08);

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new StoreService(), new RentalRepository(), new InformationService());
        productOrderService.process(user, buyWhen)

    }
}
