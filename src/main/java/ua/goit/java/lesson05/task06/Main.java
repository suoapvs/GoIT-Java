package ua.goit.java.lesson05.task06;

import ua.goit.java.lesson05.task06.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Room room = new Room(31, 2500, 1, new Date(), "Privet", "Brovary");
        System.out.println(room);
    }
}
