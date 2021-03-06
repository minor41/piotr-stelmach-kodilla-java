package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("task1");
        board.addTaskToDoList("hello");
        board.addTaskInProgressList("task 3333");
        board.addTaskDoneList("task 999");

        //Then
        System.out.println(board.toString());
        Assert.assertNotNull(board.getToDoListList());
        Assert.assertNotNull(board.getInProgressList());
        Assert.assertNotNull(board.getDoneList());
    }
}
