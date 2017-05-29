package ua.goit.java.lesson03.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(
            final String name, final int balance, final int monthsOfEmployment,
            final String companyName, final int salary, final String currency
    ) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public synchronized void paySalary() {
        this.balance += this.salary;
    }

    public synchronized void withdraw(int summ) {
        final int commission = (summ < 1000) ? 5 : 10;
        final int withdraw = summ + summ * commission / 100;
        if (withdraw <= this.balance) {
            this.balance -= withdraw;
        }
    }

    public int companyNameLength() {
        return this.companyName.length();
    }

    public void monthIncreaser(final int addMonth) {
        this.monthsOfEmployment += addMonth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return this.monthsOfEmployment;
    }

    public void setMonthsOfEmployment(final int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(final int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }
}
