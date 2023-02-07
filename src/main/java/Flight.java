import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Flight {

    //properties
    private String destination;
    private String flightID;
    private List<Passenger>passengers;


//constructor
    public Flight(String destination, String flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();

    }
//getters & setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

//method

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }


    }




