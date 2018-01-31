package com.kodilla.testing.calc;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testUser() {
        //Given
        SimpleUser simpleUser = new SimpleUser("SA", "fghj");
        //When
        String name = simpleUser.getUsername();
        String second = simpleUser.getRealName();
        //Then
        Assert.assertEquals("SA", name);
        Assert.assertEquals("fghj", second);


    }
}
