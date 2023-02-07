import java.util.ArrayList;
import java.util.List;

public class Booking {

    private List<Flight> flights;
    private List<Passenger> passengers;
   private Flight flight;
//    private Passenger passenger;

    public void Booking(){
        flights = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public List<Flight> getFlights(){
        return flights;
    }

    public void setFlights(List<Flight> flights){
        this.flights = flights;
    }
    public List<Passenger> getPassengers(){
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers){
        this.passengers = passengers;
    }

//    public void addFlight(){
////        Scanner sc = new Scanner(System.in);
////        Flight flight = new Flight(); //fix this
//////        flight.addFlight(); //fix this
//        flights.add(flight);
//    }
   public void displayAllFlights(){
       if(flights.isEmpty()){
       System.out.println("Flights not founds.");
       return;
       }
    System.out.println("Available flight:");
    for (Flight flight : flights){
    System.out.println(flight.getDestination() +": " + flight.getFlightID());
    }

   }
//
//    public void addPassenger(){
////         Scanner sc = new Scanner(System.in);
////         Passenger passenger = new Passenger();
//        passengers.add(passenger);
//     }

     public void bookPassenger(Passenger passenger, Flight flight){
        if (!passengers.contains(passenger)){
            System.out.println("Passenger not found: " );
            return;
        }

        if (!flights.contains(flight)){
            System.out.println("Flight not found: ");
            return;
        }

        flight.addPassengers(passenger);
    }
    
    
    public void cancelFlight() {
        if (!flights.contains(flight)){
            System.out.println("flight not found. ");
            return;
        }
        flights.remove(flight);
        passengers.clear();
    }


    public void bookPassenger() {
    }
}
