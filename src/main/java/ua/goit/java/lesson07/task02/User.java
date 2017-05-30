package ua.goit.java.lesson07.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final String city;
    private int balance;

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

    public void addBalance(final int balance) {
        this.balance += balance;
    }
}
