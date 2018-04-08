package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor huck_norris = new Mentor("Huck Norris");
        Mentor jackie_chan = new Mentor("Jackie Chan");
        User johnSmith = new JohnSmith();
        User ivoneEscobar = new IvoneEscobar();
        johnSmith.registeredObserver(huck_norris);
        ivoneEscobar.registeredObserver(jackie_chan);
        //When
        johnSmith.sendTask("20.1");
        johnSmith.sendTask("19.5");
        ivoneEscobar.sendTask("15.3");

        int countTasskNorris = huck_norris.getCountTasks();
        int countTasksChan = jackie_chan.getCountTasks();

        //Then
        Assert.assertEquals(2, countTasskNorris);
        Assert.assertEquals(1, countTasksChan);
    }
}
