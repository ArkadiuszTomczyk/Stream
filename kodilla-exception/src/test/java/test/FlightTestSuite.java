package test;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightBrowser;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class FlightTestSuite {
    @Test
    public void testFindFlight() {
        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        Flight flight = new Flight("Mińsk", "Berlin");
        boolean wasError = false;
        //When
        try {
            boolean result = flightBrowser.findFlight(flight);
        } catch (RouteNotFoundException e) {
            wasError = true;
        }
        //Then
        Assert.assertTrue(wasError);
    }

}
