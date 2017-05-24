package ua.goit.java.lesson05.task03.entity;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Room {

    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(
            long id, int price, int persons,
            Date dateAvailableFrom,
            String hotelName, String cityName
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Room room = (Room) object;
        return (this.price == room.price) &&
                (this.persons == room.persons) &&
                (this.cityName != null ? this.cityName.equals(room.cityName) : room.cityName == null);

    }

    @Override
    public int hashCode() {
        int result = this.price;
        result = 31 * result + this.persons;
        result = 31 * result + (this.cityName != null ? this.cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return this.persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return this.dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
