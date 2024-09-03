package com.example;
import java.util.List;

public class Availability {
    public static boolean isRoomAvailable(Room room) {
        return room.isAvailable();
    }

    public static boolean isRoomAvailable(List<Room> rooms, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}
