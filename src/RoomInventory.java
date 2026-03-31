import java.util.HashMap;

public class RoomInventory {

    private HashMap<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void displayRooms() {
        System.out.println("\nAvailable Rooms:");
        for (String type : rooms.keySet()) {
            System.out.println(type + " Rooms: " + rooms.get(type));
        }
    }

    public int getAvailableRooms(String type) {
        return rooms.getOrDefault(type, 0);
    }
}
