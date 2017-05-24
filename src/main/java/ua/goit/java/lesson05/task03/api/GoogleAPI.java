package ua.goit.java.lesson05.task03.api;

import ua.goit.java.lesson05.task03.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class GoogleAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
