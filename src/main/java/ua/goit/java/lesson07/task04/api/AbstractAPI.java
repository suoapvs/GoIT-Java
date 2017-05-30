package ua.goit.java.lesson07.task04.api;

import ua.goit.java.lesson07.task04.entity.Room;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public abstract class AbstractAPI implements API {

    protected final Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(
            final int price, final int persons,
            final String city, final String hotel
    ) {
        final Room roomToFind = new Room(0, price, persons, new Date(), hotel, city);
        final Room[] temp = new Room[this.rooms.length];
        int count = 0;
        for (int i = 0; i < this.rooms.length - 1; i++) {
            if (this.rooms[i].equals(roomToFind)) {
                System.out.println(this.rooms[i]);
                System.out.println(roomToFind);
                System.out.println();
                temp[i] = this.rooms[i];
                count++;
            }
        }
        final Room[] rooms = new Room[count];
        System.arraycopy(temp, 0, rooms, 0, count);
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }
}
