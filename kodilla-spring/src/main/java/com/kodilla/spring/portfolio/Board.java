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

   public void addTaskToDoList(final String toDo){
            toDoList.getTasks().add(toDo);
       System.out.println("Adding new task: " + toDo);
   }

   public void addTaskInProgressList(final String progressList) {
        inProgressList.getTasks().add(progressList);
       System.out.println("Adding new task: " + progressList);
   }

   public void addTaskDoneList(final String finished){
        doneList.getTasks().add(finished);
       System.out.println("Adding new task: " + finished);
   }
}
