package ua.goit.java.lesson03.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class User {

    private final static int COMMISSION_BARRIER = 1000;
    private final static int COMMISSION_LESS_BARRIER = 5;
    private final static int COMMISSION_GREAT_BARRIER = 10;

    private final String name;
    private final String companyName;
    private final int salary;
    private final String currency;
    private int balance;
    private int monthsOfEmployment;

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

    public synchronized void withdraw(final int money) {
        final int withdraw = calcWithdraw(money);
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

    public int getSalary() {
        return this.salary;
    }

    public String getCurrency() {
        return this.currency;
    }

    private int calcWithdraw(final int money) {
        final int commission = calcCommission(money);
        return money + money * commission / 100;
    }

    private int calcCommission(final int money) {
        return (money < COMMISSION_BARRIER) ? COMMISSION_LESS_BARRIER : COMMISSION_GREAT_BARRIER;
    }
}
