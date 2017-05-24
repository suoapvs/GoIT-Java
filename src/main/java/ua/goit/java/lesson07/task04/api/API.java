package ua.goit.java.lesson07.task04.api;

import ua.goit.java.lesson07.task04.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}
