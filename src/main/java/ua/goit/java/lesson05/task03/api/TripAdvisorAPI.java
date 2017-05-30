package ua.goit.java.lesson05.task03.api;

import ua.goit.java.lesson05.task03.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class TripAdvisorAPI implements API {

    @Override
    public Room[] findRooms(
            final int price, final int persons,
            final String city, final String hotel
    ) {
        return new Room[0];
    }
}
