package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private StoreService storeService;

    public ProductOrderService(StoreProcessor storeProcessor,
                               OrderRepository orderRepository,
                               SmsService smsService) {
        this.informationService = smsService;
        this.orderRepository = orderRepository;
        this.storeService = storeProcessor;
    }

    public OrderDto process(final StoreRequest storeRequest) {
        boolean isAvaliable = storeService.buy();
        System.out.println("Processing order");


        if (isAvaliable) {
            informationService.inform();
            orderRepository.createOrder();
            return new OrderDto(storeRequest.getUser(), true);
        } else {
            return new OrderDto(storeRequest.getUser(), false);
        }
    }
}
