package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatistics {


    @Test
    public void testOfUsersZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, countStatistics.getCommentCount());
        Assert.assertEquals(0, countStatistics.getNamesCount());
        Assert.assertEquals(0, countStatistics.getPostCount());
        Assert.assertEquals(0, countStatistics.getCommentPerPost(), 0);
        Assert.assertEquals(0, countStatistics.getCommentPerUser(), 0);
        Assert.assertEquals(0, countStatistics.getPostsPerUser(), 0);

    }
    @Test
    public void testOf1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        List<String> userNames = new ArrayList<>();
        userNames.add("Bogdan");
        userNames.add("Zbyszek");
        userNames.add("Jola");
        when(statisticsMock.getUserNames()).thenReturn(userNames);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, countStatistics.getCommentCount());
        Assert.assertEquals(3, countStatistics.getNamesCount());
        Assert.assertEquals(1000, countStatistics.getPostCount());
        Assert.assertEquals(0, countStatistics.getCommentPerPost(), 0);
        Assert.assertEquals(0, countStatistics.getCommentPerUser(), 0);
        Assert.assertEquals(333.3, countStatistics.getPostsPerUser(), 0.1);
    }
    @Test
    public void testCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(200);
        List<String> userNames = new ArrayList<>();
        userNames.add("Bogdan");
        userNames.add("Zbyszek");
        userNames.add("Jola");
        when(statisticsMock.getUserNames()).thenReturn(userNames);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(200, countStatistics.getCommentCount());
        Assert.assertEquals(3, countStatistics.getNamesCount());
        Assert.assertEquals(1000, countStatistics.getPostCount());
        Assert.assertEquals(0.2, countStatistics.getCommentPerPost(),0.1);
        Assert.assertEquals(66.7, countStatistics.getCommentPerUser(), 0.1);
        Assert.assertEquals(333.3, countStatistics.getPostsPerUser(), 0.1);
    }
    @Test
    public void testCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(2000);

        List<String> userNames = new ArrayList<>();
        userNames.add("Bogdan");
        userNames.add("Zbyszek");
        userNames.add("Jola");
        when(statisticsMock.getUserNames()).thenReturn(userNames);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(2000, countStatistics.getCommentCount());
        Assert.assertEquals(3, countStatistics.getNamesCount());
        Assert.assertEquals(1000, countStatistics.getPostCount());
        Assert.assertEquals(2, countStatistics.getCommentPerPost(),0.1);
        Assert.assertEquals(666.7, countStatistics.getCommentPerUser(), 0.1);
        Assert.assertEquals(333.3, countStatistics.getPostsPerUser(), 0.1);
    }
    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(200);
        List<String> userNames = new ArrayList<>();
        userNames.add("Bogdan");
        userNames.add("Zbyszek");
        userNames.add("Jola");
        when(statisticsMock.getUserNames()).thenReturn(userNames);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(200, countStatistics.getCommentCount());
        Assert.assertEquals(3, countStatistics.getNamesCount());
        Assert.assertEquals(0, countStatistics.getPostCount());
        Assert.assertEquals(0, countStatistics.getCommentPerPost(),0.1);
        Assert.assertEquals(66.7, countStatistics.getCommentPerUser(), 0.1);
        Assert.assertEquals(0, countStatistics.getPostsPerUser(), 0.1);
    }
    @Test
    public void test100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(200);
        List<String> userNames = new ArrayList<>();
        Random theGenerator = new Random();
        for (int n = 1; n <101; n++ ) {
            userNames.add(String.valueOf(theGenerator.nextInt(100)));
        }
       when(statisticsMock.getUserNames()).thenReturn(userNames);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        Assert.assertEquals(200, countStatistics.getCommentCount());
        Assert.assertEquals(100, countStatistics.getNamesCount());
        Assert.assertEquals(0, countStatistics.getPostCount());
        Assert.assertEquals(0, countStatistics.getCommentPerPost(),0.1);
        Assert.assertEquals(2, countStatistics.getCommentPerUser(), 0.1);
        Assert.assertEquals(0, countStatistics.getPostsPerUser(), 0.1);
    }
}
