package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("task list1")
    TaskList toDoList;
    @Autowired
    @Qualifier("task list2")
    TaskList inProgressList;
    @Autowired
    @Qualifier("task list3")
    TaskList doneList;


    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "task list1")
    @Scope("prototype")
    public TaskList getTaskList1(){
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "task list2")
    @Scope("prototype")
    public TaskList getTaskList2(){
        return  new TaskList(new ArrayList<>());
    }

    @Bean(name = "task list3")
    @Scope("prototype")
    public TaskList getTaskList3(){
        return new TaskList(new ArrayList<>());
    }
}
