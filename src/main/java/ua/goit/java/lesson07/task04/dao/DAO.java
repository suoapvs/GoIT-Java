package ua.goit.java.lesson07.task04.dao;

import ua.goit.java.lesson07.task04.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface DAO {

    Room[] save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(Room room);
}
