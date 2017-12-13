package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private StoreService storeService;

    public ProductOrderService(InformationService informationService,
                               OrderRepository orderRepository,
                               StoreService storeService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.storeService = storeService;
    }

    public OrderDto process(final StoreRequest storeRequest) {
        boolean isAvaliable = storeService.buy();


        if (isAvaliable) {
            informationService.inform(storeRequest.getUser());
            orderRepository.createOrder(storeRequest.getUser(), storeRequest.buyWhen());
            return new OrderDto(storeRequest.getUser(), true);
        } else {
            return new OrderDto(storeRequest.getUser(), false);
        }
    }
}
