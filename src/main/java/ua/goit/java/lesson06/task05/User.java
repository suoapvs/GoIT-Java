package ua.goit.java.lesson06.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        if (this.id != user.id)
            return false;
        if (this.salary != user.salary)
            return false;
        if (this.balance != user.balance)
            return false;
        if (this.firstName != null ? !firstName.equals(user.firstName) : user.firstName != null)
            return false;
        return this.lastName != null ? lastName.equals(user.lastName) : user.lastName == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (this.id ^ (id >>> 32));
        result = 31 * result + (this.firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (this.lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + this.salary;
        result = 31 * result + this.balance;
        return result;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
