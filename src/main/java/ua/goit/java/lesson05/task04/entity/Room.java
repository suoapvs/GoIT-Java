package ua.goit.java.lesson05.task04.entity;

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
