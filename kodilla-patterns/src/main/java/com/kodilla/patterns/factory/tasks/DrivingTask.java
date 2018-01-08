package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final String taskName;
    final String where;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    final String using;

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String isTaskExecute() {
        return where;
    }

    @Override
    public double executeTask() {
        return 0;
    }
}
