package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.finishedTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping in the Mall", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.finishedTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Paint the House", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    public void testDrivingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.finishedTask(TaskFactory.DRINGINGTASK);
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
