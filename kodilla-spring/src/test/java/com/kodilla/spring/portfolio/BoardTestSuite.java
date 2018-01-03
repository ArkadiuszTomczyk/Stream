package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {
//    @Test
//    public void testToDoList() {
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//
//        //When
//        System.out.println("====Beans List=====>>");
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
//        System.out.println("<<===Beans List====");
//        // Then
//    }
    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean list2Exist = context.containsBean("inProgressList");
        //Then
        System.out.println("bean inProgressList was found" + list2Exist);
    }

}
