import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flight {
    private String destination;
    private String flightID;
    private List<Passenger>passengers;

//    public Flight (){
//        passengers = new ArrayList<>();
//    }

    public Flight(String destination, String flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();

    }
    
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

    public void addFlight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight destination: ");
        setDestination(sc.nextLine());
        System.out.println("Enter flight ID: ");
        setFlightID(sc.nextLine());
    }

    public void addPassenger(){
        Passenger passenger = null;
        passengers.add(passenger);
    }


    public void displayAllFlights() {
        Flight flights = new Flight;
        for (Flight flight : flights);
        System.out.println("Destination: " + this.destination + "ID: " + flightID);
    }

    public void addPassengers(Passenger passenger) {
    }
}
