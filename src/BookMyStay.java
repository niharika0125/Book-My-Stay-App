import java.util.Scanner;

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");

        RoomInventory inventory = new RoomInventory();
        inventory.displayRooms();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter room type to book: ");
        String type = scanner.nextLine();

        if (inventory.bookRoom(type)) {

            // Create booking
            Booking booking = new Booking(type);
            booking.displayBooking();

        } else {
            System.out.println("Booking Failed ❌ (No rooms available)");
        }

        System.out.println("\nUpdated Availability:");
        inventory.displayRooms();

        scanner.close();
    }
}