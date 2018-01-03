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
    @Qualifier("toDoList")
    TaskList taskList;

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getTaskList1() {
       return new TaskList("toDoList");
    }

   @Bean(name = "inProgressList")
   @Scope("prototype")
    public TaskList getTaskList2() {
       return new TaskList("inProgressList");
   }

   @Bean(name = "doneList")
   @Scope("prototype")
    public TaskList getTaskList3() {
       return new TaskList("doneList");
   }

}
