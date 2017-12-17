package MainAirport;

public interface AirNavigator {
    String getAirportName();
    boolean process(Flight flight);
}
