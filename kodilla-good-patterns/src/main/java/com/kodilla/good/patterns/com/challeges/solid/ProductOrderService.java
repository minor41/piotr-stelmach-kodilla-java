package com.kodilla.good.patterns.com.challeges.solid;

public class ProductOrderService {

    private InformationService informationService;
    private SellsService sellsService;
    private SellsRepository sellsRepository;

    public ProductOrderService(final InformationService informationService, final SellsService sellsService,
                               final SellsRepository sellsRepository) {
        this.informationService = informationService;
        this.sellsService = sellsService;
        this.sellsRepository = sellsRepository;
    }

    public OrderDTO process(final BuyerInfo buyerInfo) {
        boolean sold = sellsService.createSells(buyerInfo);
        if(sold){
            informationService.inform(buyerInfo);
            sellsRepository.createOrderRepository(buyerInfo);
            return new OrderDTO(buyerInfo, true);
        } else {
            return new OrderDTO(buyerInfo, false);
        }
    }
}

