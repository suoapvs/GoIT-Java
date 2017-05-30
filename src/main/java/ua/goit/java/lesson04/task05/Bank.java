package ua.goit.java.lesson04.task05;

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

    public double moneyPaidMonthlyForSalary() {
        return this.numberOfEmployees * this.avrSalaryOfEmployee;
    }

    public int getCommission(final int summ) {
        int commission;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.USD)) {
            commission = getUSDCommission(summ);
        } else if (currency.equals(Currency.EUR)) {
            commission = getEURCommission(summ);
        } else {
            commission = 0;
        }
        return commission;
    }

    public int getLimitOfWithdrawal() {
        int limit;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.USD)) {
            limit = getUSDLimitOfWithdrawal();
        } else if (currency.equals(Currency.EUR)) {
            limit = getEURLimitOfWithdrawal();
        } else {
            limit = 0;
        }
        return limit;
    }

    public int getLimitOfFunding() {
        int limit;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.EUR)) {
            limit = getUSDLimitOfFunding();
        } else if (currency.equals(Currency.USD)) {
            limit = getUSDLimitOfFunding();
        } else {
            limit = 0;
        }
        return limit;
    }

    public int getMonthlyRate() {
        int rate;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.USD)) {
            rate = getUSDMonthlyRate();
        } else if (currency.equals(Currency.EUR)) {
            rate = getEURMonthlyRate();
        } else {
            rate = 0;
        }
        return rate;
    }

    protected abstract int getUSDLimitOfWithdrawal();

    protected abstract int getEURLimitOfWithdrawal();

    protected abstract int getUSDCommission(final int summ);

    protected abstract int getEURCommission(final int summ);

    protected abstract int getUSDLimitOfFunding();

    protected abstract int getEURLimitOfFunding();

    protected abstract int getUSDMonthlyRate();

    protected abstract int getEURMonthlyRate();
}
