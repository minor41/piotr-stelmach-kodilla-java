package com.kodilla.spring.portfolio;

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
            toDoList.addTasks(toDo);
       System.out.println("Adding new task: " + toDo);

   }

   public void addTaskInProgressList(final String progressList) {
        inProgressList.addTasks(progressList);
       System.out.println("Adding new task: " + progressList);
   }

   public void addTaskDoneList(final String finished){
        doneList.addTasks(finished);
       System.out.println("Adding new task: " + finished);
   }

   public TaskList getToDoListList(){
        return toDoList;
   }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    @Override
    public String toString() {
        return
                "toDoList = " + toDoList
        + "progressList = " +inProgressList
                + "finished = " + doneList;
    }
}
