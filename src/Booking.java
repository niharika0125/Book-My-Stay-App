import java.util.ArrayList;

public class Booking {

    private static int counter = 1;
    private int bookingId;
    private String roomType;
    private ArrayList<String> services;
    private int totalCost;

    public Booking(String roomType) {
        this.bookingId = counter++;
        this.roomType = roomType;
        this.services = new ArrayList<>();
        this.totalCost = calculateBasePrice(roomType);
    }

    private int calculateBasePrice(String type) {
        switch (type) {
            case "Single":
                return 1000;
            case "Double":
                return 2000;
            case "Suite":
                return 3000;
            default:
                return 0;
        }
    }

    public void addService(String service) {
        services.add(service);

        // Add cost for services
        switch (service) {
            case "WiFi":
                totalCost += 200;
                break;
            case "Breakfast":
                totalCost += 300;
                break;
            case "Parking":
                totalCost += 150;
                break;
        }
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

        System.out.println("Total Cost: ₹" + totalCost);
    }
}