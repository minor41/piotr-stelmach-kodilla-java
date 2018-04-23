package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    private final Deque<String> githubLinks;
    private final String nameOfStudent;

    public TaskQueue(String nameOfStudent) {
        observers = new ArrayList<>();
        githubLinks = new ArrayDeque<>();
        this.nameOfStudent = nameOfStudent;
    }

    public void addTask(String newTask) {
        githubLinks.add(newTask);
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

    public Deque<String> getGithubLinks() {
        return githubLinks;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }
}
