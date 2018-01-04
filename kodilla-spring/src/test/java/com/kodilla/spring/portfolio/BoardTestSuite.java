package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.IntStream;
@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;

//    @Test
//    public void testConditional() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
//        //When
//        boolean list2Exist = context.containsBean("inProgressList");
//        //Then
//        System.out.println("bean inProgressList was found" + list2Exist);
//    }
    @Test
    public void testToDoList() {
        //Given
        //When
        board.getToDoList().getTasks().add("TODO1");
        board.getInProgressList().getTasks().add("INPROG1");
        board.getDoneList().getTasks().add("DON1");
        //Then
        Assert.assertEquals("TODO1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("INPROG1", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("DON1", board.getDoneList().getTasks().get(0));

    }

}
