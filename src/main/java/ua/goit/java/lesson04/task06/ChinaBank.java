package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class ChinaBank extends Bank {

    public ChinaBank(
            final long id, final String bankCountry, final Currency currency,
            final int numberOfEmployees, final double avrSalaryOfEmployee,
            final long rating, final long totalCapital) {
        super(
                id, bankCountry, currency, numberOfEmployees,
                avrSalaryOfEmployee, rating, totalCapital
        );
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limit;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.USD)) {
            limit = 100;
        } else if (currency.equals(Currency.EUR)) {
            limit = 150;
        } else {
            limit = 0;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.EUR)) {
            limit = 5000;
        } else if (currency.equals(Currency.USD)) {
            limit = 10000;
        } else {
            limit = 0;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate;
        if (getCurrency().equals(Currency.USD)) {
            rate = 1;
        } else {
            rate = 0;
        }
        return rate;
    }

    @Override
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

    private int getUSDCommission(final int summ) {
        return (summ < 1000) ? 3 : 5;
    }

    private int getEURCommission(final int summ) {
        return (summ < 1000) ? 10 : 11;
    }
}
