package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final String name;
    public List<String> task = new ArrayList<>();


    public TaskList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' +
                ", task=" + task +
                '}';
    }
}
