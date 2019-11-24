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
    private Passenger passenger6;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA123", "LHR", "EDI", "0800");
        passenger1 = new Passenger("Alfredo Morelos", 2);
        passenger2 = new Passenger("Steven Davis", 1);
        passenger3 = new Passenger("James Tavernier", 2);
        passenger4 = new Passenger("Jermain Defoe", 3);
        passenger5 = new Passenger("Joe Aribo", 2);
        passenger6 = new Passenger("Borna Barisic", 1);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void fightHasFlightNumber(){
        assertEquals("BA123", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("LHR", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("0800", flight.getDepartureTime());
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

    @Test
    public void testNumberOfSeatsAvailable(){
        assertEquals(5, flight.numberOfSeatsAvailable());
    }

    @Test
    public void testPlaneHasCapacity(){
        assertEquals(true, flight.planeHasCapacity());
    }

    @Test
    public void testCanBookPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void testCannotAddPassenger__planeFull(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(5, flight.getNumberOfPassengers());
    }

}
