package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jack = new Millenials("Jack Sparrow");
        User dog = new ZGeneration("Jane Seimour");
        User bob = new YGeneration("Bob Budowniczy");

        //When
        String jackShouldUse = jack.sharePost();
        System.out.println("Jack should" + jackShouldUse);
        String dogShouldUse = dog.getName();
        System.out.println("Dog should" + dogShouldUse);
        String bobShouldUse = bob.sharePost();
        System.out.println("Bob should" + bobShouldUse);

        //Then
        Assert.assertEquals("We use Facebook", jackShouldUse);
        Assert.assertEquals("Jane Seimour", dogShouldUse);
        Assert.assertEquals("we use twitter", bobShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jack = new Millenials("Jack Samurai");

        //When
        String jachShouldUse = jack.sharePost();
        System.out.println("Jack should:" + jachShouldUse);
        jack.setSocialPublisher(new TwitterPublisher());
        jachShouldUse = jack.sharePost();
        System.out.println("Jack now should:" + jachShouldUse);

        //Then
        Assert.assertEquals("we use twitter", jachShouldUse);
    }
}
