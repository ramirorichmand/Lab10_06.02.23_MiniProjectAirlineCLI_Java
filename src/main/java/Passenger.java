public class Passenger {
    private String name;
    private int passengerID;
    private String contact;

    public Passenger(String name, int passengerID, String contact) {
        this.name = name;
        this.passengerID = passengerID;
        this.contact = contact;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

   




}
