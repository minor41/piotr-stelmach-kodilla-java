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
        toDo.add("task 4");
        System.out.println("Adding new task: " + toDo);
   }

   public void addTaskInProgressList(final List<String> progressList) {
        progressList.add("task 3");
       System.out.println("Adding new task: " + progressList);
   }

   public void addTaskDoneList(final List<String> finished){
        finished.add("task 3");
       System.out.println("Adding new task: " + finished);
   }
}
