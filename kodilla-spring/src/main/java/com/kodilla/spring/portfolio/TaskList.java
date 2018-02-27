package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = new ArrayList<>();
    }

    public void addTasks(String newTask){
        tasks.add(newTask);
    }
}
