package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask ("something to drive", "Barcelona", "car");
            case PAINTINGTASK:
                return new PaintingTask("picture", "Pink", "Big Black Fly");
            case SHOPPINGTASK:
                return new ShoppingTask("ShoppingTask", "car", 3);
                default:
                    return null;
        }
    }
}
