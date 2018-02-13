package com.kodilla.good.patterns.com.challeges.solid;

public class Application2 {

    public static void main(String[] args) {

        BuyerInfoRetriever buyerInfoRetriever = new BuyerInfoRetriever();
        BuyerInfo buyerInfo = buyerInfoRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService( new MailGameService(" J.Kane@o9.de "),
                new GamesSellsService("Game 1", 1),
                new GameSellsRepository("Game 1", 1));

        productOrderService.process(buyerInfo);

      BuyerInfoRetriever buyerInfoRetriever1 = new BuyerInfoRetriever();
      BuyerInfo buyerInfo1 = buyerInfoRetriever1.retrieve1();

      ProductOrderService productOrderService1 = new ProductOrderService(new MailSandalsService("p.doe@o2.com"),
              new SandalsSellsService("Crocs", 49),
              new SandalsSallesRepository("Crocs", 49));

      productOrderService1.process(buyerInfo1);
    }
}