package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskQueueTestSuite {

    @Test
    public void taskUpdate(){
        //Given
        Mentors mentor1 = new Mentors("Paul");
        Mentors mentor2 = new Mentors("Robert");

        TaskQueue johnsQueue = new JohnTaskQueue();
        TaskQueue peterQueue = new PeterTaskQueue();

        johnsQueue.registerObserver(mentor1);
        peterQueue.registerObserver(mentor2);

        //When
        johnsQueue.addTask("20.1");
        johnsQueue.addTask("19.1");
        johnsQueue.addTask("22.6");
        johnsQueue.addTask("23.5");
        peterQueue.addTask("16.2");
        peterQueue.addTask("11.5");
        peterQueue.addTask("9.0");

        //Then
        assertEquals(4, mentor1.getCheckedTasks());
        assertEquals(7, mentor2.getCheckedTasks());

    }

}