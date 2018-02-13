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

    public SellsDTO process(final BuyerInfo buyerInfo) {
        boolean isSold = sellsService.createSells(buyerInfo.getUser(), buyerInfo.getWhenSold(), buyerInfo.getWhenGotMoney(),
                buyerInfo.getWhenShipped());
        if(isSold){
            informationService.inform(buyerInfo.getUser());
            sellsRepository.createSells(buyerInfo.getUser(), buyerInfo.getWhenSold(), buyerInfo.getWhenGotMoney(),
                    buyerInfo.getWhenShipped());
            return new SellsDTO(buyerInfo.getUser(), true);
        } else {
            return new SellsDTO(buyerInfo.getUser(), false);
        }
    }
}

