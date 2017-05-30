package ua.goit.java.lesson05.task05.api;

import ua.goit.java.lesson05.task05.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class BookingComAPI extends AbstractAPI implements API {

    public BookingComAPI() {
        this.rooms[0] = new Room(11, 2500, 1, new Date(), "Nowyi", "Kyiv");
        this.rooms[1] = new Room(12, 1500, 2, new Date(), "Grand", "Kyiv");
        this.rooms[2] = new Room(13, 2100, 1, new Date(), "Gernyi", "Kharkiv");
        this.rooms[3] = new Room(14, 1500, 2, new Date(), "Boom", "Cherkassy");
        this.rooms[4] = new Room(15, 2500, 1, new Date(), "Privet", "Brovary");
    }
}
