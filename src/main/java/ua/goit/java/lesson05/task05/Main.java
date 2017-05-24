package ua.goit.java.lesson05.task05;

import ua.goit.java.lesson05.task05.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Room room = new Room(1, 1000, 1, new Date(), "Hotel", "Kyiv");
        System.out.println(room);
    }
}
