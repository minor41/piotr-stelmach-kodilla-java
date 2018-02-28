package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: " + taskName + " want to buy " + whatToBuy +
        " need " + quantity);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
         new ShoppingTask("Shopping in the Mall", "shoes", 1).executeTask();
            return true;
    }
}
