package MainAirport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    List<Flight1> flight1s = new ArrayList<>();

    public List<Flight1> getFlight1sTo(String arrival) {
        return flight1s.stream()
                .filter(f ->f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight1> getFlight1sFrom(String departure) {
        return flight1s.stream()
                .filter(g ->g.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }
    public List<Flight1> getFlight1sVia(String via, String arrival) {
        List<Flight1> result = getFlight1sTo(via);
        result.addAll(getFlight1sTo(arrival));
        return result;

    }

    public FlightService(){
        flight1s.add(new Flight1("ALASKA", "Berlin"));
        flight1s.add(new Flight1("Las vegas", "ALASKA"));
        flight1s.add(new Flight1("Berlin", "Las Angeles"));
        flight1s.add(new Flight1("Moscow", "Las vegas"));
        flight1s.add(new Flight1("Warszawa", "Moscow"));
    }

    public List<Flight1> getFlight1sList() {
        return new ArrayList<>(flight1s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightService)) return false;

        FlightService that = (FlightService) o;

        return flight1s != null ? flight1s.equals(that.flight1s) : that.flight1s == null;
    }

}
