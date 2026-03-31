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

    public boolean isAvailable(String type) {
        return rooms.getOrDefault(type, 0) > 0;
    }

    public boolean bookRoom(String type) {
        int available = rooms.getOrDefault(type, 0);

        if (available > 0) {
            rooms.put(type, available - 1);
            return true;
        }
        return false;
    }
}