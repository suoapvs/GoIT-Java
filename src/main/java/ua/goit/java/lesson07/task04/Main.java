package ua.goit.java.lesson07.task04;

import ua.goit.java.lesson07.task04.controller.Controller;
import ua.goit.java.lesson07.task04.entity.Room;

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
