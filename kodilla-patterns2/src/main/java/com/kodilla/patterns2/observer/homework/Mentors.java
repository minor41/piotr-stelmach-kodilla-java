package com.kodilla.patterns2.observer.homework;

public class Mentors implements Observer {
    private final String mentorName;
    private int checkedTasks;

    public Mentors(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(mentorName + ": You've got new task to check for: " + taskQueue.getNameOfStudent() + "\n" +
                "You have: " + taskQueue.getTasks().size() + " tasks to check");
        checkedTasks++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCheckedTasks() {
        return checkedTasks;
    }
}
