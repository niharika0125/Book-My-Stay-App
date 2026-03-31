import java.util.ArrayList;

public class Booking {

    private static int counter = 1;
    private int bookingId;
    private String roomType;
    private ArrayList<String> services;

    public Booking(String roomType) {
        this.bookingId = counter++;
        this.roomType = roomType;
        this.services = new ArrayList<>();
    }

    public void addService(String service) {
        services.add(service);
    }

    public void displayBooking() {
        System.out.println("\nBooking Confirmed ✅");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Room Type: " + roomType);

        System.out.println("Services:");
        if (services.isEmpty()) {
            System.out.println("No add-on services selected");
        } else {
            for (String s : services) {
                System.out.println("- " + s);
            }
        }
    }
}