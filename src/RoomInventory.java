import java.util.*;

public class RoomInventory {

    private HashMap<String, Integer> rooms;
    private Queue<String> waitlist;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);

        waitlist = new LinkedList<>();
    }

    public void displayRooms() {
        System.out.println("\nAvailable Rooms:");
        for (String type : rooms.keySet()) {
            System.out.println(type + " Rooms: " + rooms.get(type));
        }
    }

    public synchronized boolean bookRoom(String type) {
        int available = rooms.getOrDefault(type, 0);

        if (available > 0) {
            rooms.put(type, available - 1);
            return true;
        } else {
            waitlist.add(type);
            System.out.println("Added to waitlist ⏳");
            return false;
        }
    }

    public synchronized void releaseRoom(String type) {
        int available = rooms.getOrDefault(type, 0);
        rooms.put(type, available + 1);

        processWaitlist();
    }

    private void processWaitlist() {
        if (!waitlist.isEmpty()) {
            String next = waitlist.poll();
            System.out.println("Allocating room to waitlisted request: " + next);
            bookRoom(next);
        }
    }
}