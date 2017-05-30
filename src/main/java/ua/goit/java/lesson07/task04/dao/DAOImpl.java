package ua.goit.java.lesson07.task04.dao;

import ua.goit.java.lesson07.task04.entity.Room;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class DAOImpl implements DAO {

    private final static int DEFAULT_CAPACITY = 10;

    private Room[] rooms = new Room[DEFAULT_CAPACITY];

    private int count = 0;

    @Override
    public Room[] save(final Room room) {
        System.out.println("Save " + room);
        checkCapacity();
        this.rooms[count++] = room;
        return this.rooms;
    }

    @Override
    public boolean delete(final Room room) {
        System.out.println("Delete " + room);
        boolean result = false;
        for (int i = 0; i < this.count; i++) {
            if (this.rooms[i].equals(room)) {
                for (int j = i; i < this.count - 1; i++) {
                    this.rooms[j] = this.rooms[j + 1];
                }
                result = true;
            }
        }
        return result;
    }

    @Override
    public Room update(final Room room) {
        System.out.println("Update " + room);
        Room savingRoom = null;
        for (int i = 0; i < this.count; i++) {
            if (this.rooms[i].getId() == room.getId()) {
                savingRoom = this.rooms[i] = room;
            }
        }
        return savingRoom;
    }

    @Override
    public Room findById(final Room room) {
        System.out.println("Find By Id " + room);
        Room result = null;
        for (Room _room : this.rooms) {
            if (room.getId() == _room.getId()) {
                result = room;
                break;
            }
        }
        return result;
    }

    private void checkCapacity() {
        if (this.count + 1 >= this.rooms.length) {
            final Room[] temp = this.rooms;
            this.rooms = new Room[temp.length * 3 / 2 + 1];
            System.arraycopy(temp, 0, this.rooms, 0, temp.length);
        }
    }
}
