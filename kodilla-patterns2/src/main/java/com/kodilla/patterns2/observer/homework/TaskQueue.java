package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    private final Deque<String> tasks;
    private final String nameOfStudent;

    public TaskQueue(String nameOfStudent) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.nameOfStudent = nameOfStudent;
    }

    public void addTask(String newTask) {
        tasks.add(newTask);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }
}
