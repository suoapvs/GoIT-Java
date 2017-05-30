package ua.goit.java.lesson04.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public abstract class Bank {

    private final long id;
    private final String bankCountry;
    private final Currency currency;
    private final int numberOfEmployees;
    private final double avrSalaryOfEmployee;
    private final long rating;
    private final long totalCapital;

    public Bank(
            final long id, final String bankCountry, final Currency currency,
            final int numberOfEmployees, final double avrSalaryOfEmployee,
            final long rating, final long totalCapital
    ) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract int getMonthlyRate();

    public abstract int getCommission(final int summ);

    public abstract double moneyPaidMonthlyForSalary();
}
