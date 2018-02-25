package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

   public void addTaskToDoList(){
        System.out.println("Adding new task: " + toDoList);
   }

   public void addTaskInProgressList() {
       System.out.println("Adding new task: " + inProgressList);
   }

   public void addTaskDoneList(){
       System.out.println("Adding new task: " + doneList);
   }
}
