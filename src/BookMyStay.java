import java.util.Scanner;

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");

        RoomInventory inventory = new RoomInventory();
        inventory.displayRooms();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter room type to check availability: ");
        String type = scanner.nextLine();

        if (inventory.isAvailable(type)) {
            System.out.println("Room is Available ✅");
        } else {
            System.out.println("Room is NOT Available ❌");
        }

        scanner.close();
    }
}