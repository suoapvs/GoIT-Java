package ua.goit.java.lesson05.task06.api;

import ua.goit.java.lesson05.task06.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class TripAdvisorAPI extends AbstractAPI implements API {

    public TripAdvisorAPI() {
        this.rooms[0] = new Room(31, 2500, 1, new Date(), "Privet", "Brovary");
        this.rooms[1] = new Room(32, 1500, 2, new Date(), "Grand", "Kyiv");
        this.rooms[2] = new Room(33, 1500, 1, new Date(), "Boom", "Cherkassy");
        this.rooms[3] = new Room(34, 2100, 2, new Date(), "Gernyi", "Kharkiv");
        this.rooms[4] = new Room(35, 2500, 1, new Date(), "Nowyi", "Kyiv");
    }
}
