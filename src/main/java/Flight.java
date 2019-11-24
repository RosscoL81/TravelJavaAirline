import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime)
    {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }


    public int getNumberOfPassengers() {
        return this.passengers.size();
    }


    public int numberOfSeatsAvailable() {
        int seatsAvailable =  plane.getPlanesCapacity() - this.passengers.size();
        return seatsAvailable;
    }


    public boolean planeHasCapacity() {
        return this.numberOfSeatsAvailable() > 0;
    }

    public void addPassenger(Passenger passenger) {
        if (planeHasCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }
}

