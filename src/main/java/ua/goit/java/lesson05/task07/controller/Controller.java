package ua.goit.java.lesson05.task07.controller;

import ua.goit.java.lesson05.task07.api.API;
import ua.goit.java.lesson05.task07.api.BookingComAPI;
import ua.goit.java.lesson05.task07.api.GoogleAPI;
import ua.goit.java.lesson05.task07.api.TripAdvisorAPI;
import ua.goit.java.lesson05.task07.dao.DAO;
import ua.goit.java.lesson05.task07.dao.DAOImpl;
import ua.goit.java.lesson05.task07.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Controller {

    private final API apis[] = new API[3];

    private final DAO dao = new DAOImpl();

    public Controller() {
        this.apis[0] = new BookingComAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[0];
        for (API api : this.apis) {
            final Room[] findRooms = api.findRooms(price, persons, city, hotel);
            if (findRooms.length > 0) {
                final Room[] temp = rooms;
                rooms = new Room[temp.length + findRooms.length];
                System.arraycopy(temp, 0, rooms, 0, temp.length);
                System.arraycopy(findRooms, 0, rooms, temp.length, findRooms.length);
            }
        }
        save(rooms);
        return rooms;
    }

    public Room[] check(API api1, API api2) {
        Room[] rooms = new Room[0];
        for (Room room1 : api1.getAll()) {
            for (Room room2 : api2.getAll()) {
                if (room2.equals(room1)) {
                    final Room[] temp = rooms;
                    rooms = new Room[temp.length + 1];
                    System.arraycopy(temp, 0, rooms, 0, temp.length);
                    rooms[rooms.length - 1] = room2;
                }
            }
        }
        save(rooms);
        return rooms;
    }

    private void save(final Room[] rooms) {
        for (Room room : rooms) {
            this.dao.save(room);
        }
    }
}
