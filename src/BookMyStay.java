import java.util.HashMap;

public class BookMyStay{

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");

        // Room types with static availability
        HashMap<String, Integer> rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);

        System.out.println("\nAvailable Rooms:");
        for (String type : rooms.keySet()) {
            System.out.println(type + " Rooms: " + rooms.get(type));
        }
    }
}