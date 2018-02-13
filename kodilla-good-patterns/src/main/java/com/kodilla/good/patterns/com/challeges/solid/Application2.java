package com.kodilla.good.patterns.com.challeges.solid;

public class Application2 {

    public static void main(String[] args) {

        BuyerInfoRetriever buyerInfoRetriever = new BuyerInfoRetriever();
        BuyerInfo buyerInfo = buyerInfoRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService( new MailGameService(),
                new GamesSellsService(),
                new GameSellsRepository());

        productOrderService.process(buyerInfo);

      BuyerInfoRetriever buyerInfoRetriever1 = new BuyerInfoRetriever();
      BuyerInfo buyerInfo1 = buyerInfoRetriever1.retrieve1();

      ProductOrderService productOrderService1 = new ProductOrderService(new MailSandalsService(),
              new SandalsSellsService(),
              new SandalsSallesRepository());

      productOrderService1.process(buyerInfo1);
    }
}