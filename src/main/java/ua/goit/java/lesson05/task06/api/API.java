package ua.goit.java.lesson05.task06.api;

import ua.goit.java.lesson05.task06.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}
