package ua.goit.java.lesson06.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final int balance;

    public User(
            final long id, final String firstName, final String lastName,
            final int salary, final int balance
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public int getSalary() {
        return this.salary;
    }

    public int getBalance() {
        return this.balance;
    }
}
