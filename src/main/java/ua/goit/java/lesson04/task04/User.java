package ua.goit.java.lesson04.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private final long id;
    private final String name;
    private final double balance;
    private final int monthsOfEmployment;
    private final String companyName;
    private final int salary;
    private final Bank bank;

    public User(
            final long id, final String name, final double balance,
            final int monthsOfEmployment, final String companyName,
            final int salary, final Bank bank
    ) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", balance=" + this.balance +
                ", monthsOfEmployment=" + this.monthsOfEmployment +
                ", companyName='" + this.companyName + '\'' +
                ", salary=" + this.salary +
                ", bank=" + this.bank +
                '}';
    }
}
