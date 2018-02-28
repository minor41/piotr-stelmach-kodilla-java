package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
        public static final String SHOPPINGTASK = "Shopping Task";
        public static final String PAINTINGTASK = "Painting Task";
        public static final String DRINGINGTASK = "Driving Task";


    public final Task finishedTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping in the Mall", "Shoes", 1);
            case PAINTINGTASK:
                return new PaintingTask("Paint the House", "blue", "Outside walls");
            case DRINGINGTASK:
                return new DrivingTask("Driving", "work", "car");
            default:
                return null;
        }
    }
}


