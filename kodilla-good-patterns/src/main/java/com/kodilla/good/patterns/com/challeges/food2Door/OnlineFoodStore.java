package com.kodilla.good.patterns.com.challeges.food2Door;

public class OnlineFoodStore {

    private OrderService orderService;


    public OnlineFoodStore(final OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDTO process(final ProducerInfo producer){
        boolean newOrderPlaced = orderService.createOrder(producer.getProducer(), producer.getOrderedItems(),
                producer.getNumberOfOrder());
        if (newOrderPlaced){
            return new OrderDTO( producer.getProducer(), true);
        }else {
            return new OrderDTO( producer.getProducer(), false);
        }
    }
}
