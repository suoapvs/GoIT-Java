package ua.goit.java.lesson05.task07;

import ua.goit.java.lesson05.task07.controller.Controller;
import ua.goit.java.lesson05.task07.entity.Room;

import java.util.Arrays;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Controller controller = new Controller();
        final Room[] requestRooms = controller.requestRooms(2500, 1, "Kyiv", "Nowyi");
        System.out.println("requestRooms: " + Arrays.toString(requestRooms));
    }
}
