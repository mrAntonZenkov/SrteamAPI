import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        findPlanesLeavingInTheNextTwoHours(airport).forEach(System.out::println);

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights()
                        .stream().filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)))
                .filter(flight -> flight.getDate().getTime() >= System.currentTimeMillis())
                .filter(flight -> flight.getDate().getTime() <= System.currentTimeMillis() + 7200000)
                .collect(Collectors.toList());

    }
}