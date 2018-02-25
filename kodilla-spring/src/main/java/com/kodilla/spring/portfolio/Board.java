package com.kodilla.spring.portfolio;

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

   public void addTaskToDoList(final List<String> toDo){
        toDo.add("task 1");
        System.out.println("Adding new task: " + toDo);
   }

   public void addTaskInProgressList(final List<String> progressList) {
       System.out.println("Adding new task: " + progressList.add("task 000"));
   }

   public void addTaskDoneList(final List<String> finished){
       System.out.println("Adding new task: " + finished);
   }
}
