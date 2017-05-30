package ua.goit.java.lesson05.task07.api;

import ua.goit.java.lesson05.task07.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class GoogleAPI extends AbstractAPI implements API {

    public GoogleAPI() {
        this.rooms[0] = new Room(21, 2000, 1, new Date(), "Nowyi", "Kyiv");
        this.rooms[1] = new Room(22, 1500, 2, new Date(), "Boom", "Cherkassy");
        this.rooms[2] = new Room(23, 2100, 1, new Date(), "Gernyi", "Kharkiv");
        this.rooms[3] = new Room(24, 1500, 2, new Date(), "Grand", "Kyiv");
        this.rooms[4] = new Room(25, 2000, 1, new Date(), "Privet", "Brovary");
    }
}
