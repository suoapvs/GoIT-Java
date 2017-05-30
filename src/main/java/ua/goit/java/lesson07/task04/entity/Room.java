package ua.goit.java.lesson07.task04.entity;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Room {

    private final long id;
    private final int price;
    private final int persons;
    private final Date dateAvailableFrom;
    private final String hotelName;
    private final String cityName;

    public Room(
            final long id, final int price, final int persons,
            final Date dateAvailableFrom,
            final String hotelName, final String cityName
    ) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", persons=" + this.persons +
                ", dateAvailableFrom=" + this.dateAvailableFrom +
                ", hotelName='" + this.hotelName + '\'' +
                ", cityName='" + this.cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Room room = (Room) object;
        return (this.price == room.price) &&
                (this.persons == room.persons) &&
                (this.hotelName != null ? this.hotelName.equals(room.hotelName) : room.hotelName == null) &&
                (this.cityName != null ? this.cityName.equals(room.cityName) : room.cityName == null);

    }

    @Override
    public int hashCode() {
        int result = this.price;
        result = 31 * result + this.persons;
        result = 31 * result + (this.hotelName != null ? this.hotelName.hashCode() : 0);
        result = 31 * result + (this.cityName != null ? this.cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPersons() {
        return this.persons;
    }

    public Date getDateAvailableFrom() {
        return this.dateAvailableFrom;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public String getCityName() {
        return this.cityName;
    }
}
