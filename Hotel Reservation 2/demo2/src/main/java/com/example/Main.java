package com.example;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Room room1 = new Room(101, "Single", 100.0);
        Room room2 = new Room(102, "Double", 150.0);
        hotel.addRoom(room1);
        hotel.addRoom(room2);

        Guest guest = new Guest("John Doe", "john@example.com");

        Payment payment = new Payment(100.0, "Credit Card");
        hotel.makeReservation(room1, guest, new Date(), new Date(), payment);

        System.out.println("Available rooms: " + hotel.availableRooms());
    }
    }
