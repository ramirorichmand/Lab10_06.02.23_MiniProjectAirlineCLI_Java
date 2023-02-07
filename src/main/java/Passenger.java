public class Passenger {
    private String name;
    private String passengerID;
    private String contact;

    public Passenger(String name, String passengerID, String contact) {
        this.name = name;
        this.passengerID = passengerID;
        this.contact = contact;
    }

//getters & setters
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

   




}
