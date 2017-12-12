package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private RentalRepository rentalRepository;
    private StoreService storeService;

    public ProductOrderService(final InformationService informationService,
                               final RentalRepository rentalRepository,
                               final StoreService storeService) {
        this.informationService = informationService;
        this.rentalRepository = rentalRepository;
        this.storeService = storeService;
    }
    public RentalDto process(final StoreRequest storeRequest) {
        boolean isAvaliable = storeService.rent();

        if (isAvaliable) {
            informationService.inform(storeRequest.getUser());
            rentalRepository.createOrder(storeRequest.getUser(), storeRequest.buyWhen());
            return new RentalDto(storeRequest.getUser(), true);
        } else {
            return new RentalDto(storeRequest.getUser(), false)
        }
    }
}
