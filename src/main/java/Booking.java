import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Booking {

    //properties
    private List<Flight> flights;
    private List<Passenger> passengers;
//     private Flight flight;
//     private Passenger passenger;

    // constructor
    public Booking() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
//         this.flight=flight;
//         this.passenger = passenger;

    }

    //getters & setters
    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

// methods

    public void addFlight() {
        Flight flight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight destination: ");
        String destination = sc.nextLine();
        //             System.out.println("Enter flight ID: ");
        //             setFlightID(sc.nextLine());
        String flightID = UUID.randomUUID().toString();
        System.out.println("Your flight ID is: " + flightID);
        flight = new Flight(destination, flightID);
        flights.add(flight);
    }

    public void createPassenger() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger name: ");
        String name = sc.nextLine();
        System.out.println("Enter email: ");
        String contact = sc.nextLine();

        String passengerID = UUID.randomUUID().toString();
        System.out.println("Your passenger ID is: " + passengerID);

        Passenger passenger = new Passenger(name, passengerID, contact);
        this.passengers.add(passenger);
    }

    public void bookPassenger() {
        Flight flight = flights.get(0);
        Passenger passenger = passengers.get(passengers.size() - 1);
        flight.addPassenger(passenger);
    }

    public void displayAllFlights() {
        if (flights.isEmpty()) {
            System.out.println("Flights not founds.");

        } else {
            System.out.println("Available flight:");
            for (Flight flight : flights) {
                System.out.println(flight.getDestination() + ": " + flight.getFlightID());
            }

        }

    }

    public void cancelFlight() {
        Flight flight = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the flight ID: ");
        String flightID = sc.nextLine();
        for (Flight f : flights) {
            if (f.getFlightID() == flightID) {
                flight = f;
                break;
            }
        }
        //checking
        if (flight == null) {
            System.out.println("flight not found. ");
        } else {
            System.out.println("You have cancelled your flight: " + flightID);
            passengers.clear();
        }
        System.out.println("You have cancelled this flight.");
        flights.remove(flight);
        passengers.clear();
    }


    //possible code?

//   public void cancelFlight(){
//            Scanner sc = new Scanner(System.in);
//             System.out.println("Enter Passenger ID: ");
//             String passengerID = sc.nextLine();
//             Passenger passengerToCancel = null;
//             for (Passenger passenger : passengers) {
//                 if (passenger.getId().equals(passengerID));
//                 passengerToCancel = passenger;
//                 break;
//             }
//
//         }
//        if (passengerToCancel != null) {
//            passengers.remove(passengerToCancel);
//            System.out.println("Flight for passenger + "passengerToCancel.getName() + "has been cancelled");
//        } else {
//            System.out.println("Passenger with ID " + passengerID + "not found.");
//        }
//        }

    // alternative code for flight
//    public void cancelFlight() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter flight ID: ");
//        int flightId = sc.nextInt();
//        Flight flight = null;
//        for (Flight f : flights) {
//            if (f.getId() == flightId) {
//                flight = f;
//                break;
//            }
//        }
//        if (flight != null) {
//            flight.cancelFlight();
//        } else {
//            System.out.println("Flight with ID " + flightId + " not found.");
//        }
//    }


}
