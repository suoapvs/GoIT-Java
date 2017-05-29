package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class EUBank extends Bank {

    public EUBank(
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
            limit = 2000;
        } else if (currency.equals(Currency.EUR)) {
            limit = 2200;
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
            limit = 20000;
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
        if (getCurrency().equals(Currency.EUR)) {
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
            if (summ < 1000) {
                commission = 5;
            } else {
                commission = 7;
            }
        } else if (currency.equals(Currency.EUR)) {
            if (summ < 1000) {
                commission = 2;
            } else {
                commission = 4;
            }
        } else {
            commission = 0;
        }
        return commission;
    }
}
