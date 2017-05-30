package ua.goit.java.lesson09.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final String city;
    private final int balance;

    public User(
            final long id, final String firstName, final String lastName,
            final String city, final int balance
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", city='" + this.city + '\'' +
                ", balance=" + this.balance +
                '}';
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCity() {
        return this.city;
    }

    public int getBalance() {
        return this.balance;
    }
}
