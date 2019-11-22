import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA123", "LHR", "EDI", "0800");
        passenger1 = new Passenger("Alfredo Morelos", 2);
        passenger2 = new Passenger("Steven Davis", 1);
        passenger1 = new Passenger("James Tavernier", 2);
        passenger1 = new Passenger("Jermain Defoe", 3);
        passenger1 = new Passenger("Joe Aribo", 2);
    }

    @Test
    public void noPassengersOnPlane(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerToPlane(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());

    }



}
