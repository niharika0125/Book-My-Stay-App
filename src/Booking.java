public class Booking{

    private static int counter = 1;
    private int bookingId;
    private String roomType;

    public Booking(String roomType) {
        this.bookingId = counter++;
        this.roomType = roomType;
    }

    public void displayBooking() {
        System.out.println("\nBooking Confirmed ✅");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Room Type: " + roomType);
    }
}