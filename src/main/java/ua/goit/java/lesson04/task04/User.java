package ua.goit.java.lesson04.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(
            long id, String name, double balance,
            int monthsOfEmployment, String companyName,
            int salary, Bank bank
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
