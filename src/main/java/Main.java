import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Booking booking = new Booking();

        while (true){

            System.out.println(" ---- Flight Booking Management ----");
            System.out.println("1. Add a new flight");
            System.out.println("2. Display all available flights");
            System.out.println("3. Add a new passenger");
            System.out.println("4. Book passenger onto a flight");
            System.out.println("5. Cancel a flight");
            System.out.println("6. Exit system");
            System.out.println("Enter a number from 1 to 6: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    booking.addFlight();
                    break;
                case 2:
                    booking.displayAllFlights();
                    break;
                case 3:
                    booking.createPassenger();
                    break;
                case 4:
                    booking.bookPassenger();
                    break;
                case 5:
                    booking.cancelFlight();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }



    }



    }
}
