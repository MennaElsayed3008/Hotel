package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void makeReservation(Room room, Guest guest, Date checkInDate, Date checkOutDate, Payment payment) {
        if (Availability.isRoomAvailable(room)) {
            Reservation reservation = new Reservation(room, guest, checkInDate, checkOutDate);
            reservations.add(reservation);
            room.setAvailable(false);
            if (payment.processPayment()) {
                System.out.println("Reservation confirmed.");
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getRoom().setAvailable(true);
    }

    public List<Room> availableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", reservations=" + reservations +
                '}';
    }
    
}
