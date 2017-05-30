package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class User {

    private final long id;
    private final String name;
    
    private final int monthsOfEmployment;
    private final String companyName;
    private final Bank bank;

    private int salary;
    private double balance;

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

    public long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return this.monthsOfEmployment;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return this.bank;
    }
}
