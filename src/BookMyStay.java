import java.util.Scanner;

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");

        RoomInventory inventory = new RoomInventory();
        inventory.displayRooms();

        Scanner scanner = new Scanner(System.in);

        // Booking
        System.out.print("\nEnter room type to book: ");
        String type = scanner.nextLine();

        if (inventory.bookRoom(type)) {

            Booking booking = new Booking(type);

            // Add-on services
            System.out.println("\nSelect Add-On Services:");
            System.out.println("1. WiFi\n2. Breakfast\n3. Parking\n4. No Services");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    booking.addService("WiFi");
                    break;
                case 2:
                    booking.addService("Breakfast");
                    break;
                case 3:
                    booking.addService("Parking");
                    break;
                default:
                    break;
            }

            booking.displayBooking();

            // Cancellation option
            System.out.print("\nDo you want to cancel booking? (yes/no): ");
            scanner.nextLine(); // clear buffer
            String cancel = scanner.nextLine();

            if (cancel.equalsIgnoreCase("yes")) {
                booking.cancelBooking(inventory);
            }

        } else {
            System.out.println("No rooms available. You are added to waitlist.");
        }

        scanner.close();
    }
}