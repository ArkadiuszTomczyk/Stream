package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Something", shopping.getTaskName());
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Barcelona", drive.getTaskName());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Fly", paint.getTaskName());
    }
}
