package ua.goit.java.lesson04.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class USBank extends Bank {

    public USBank(
            long id, String bankCountry, Currency currency,
            int numberOfEmployees, double avrSalaryOfEmployee,
            long rating, long totalCapital) {
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
            limit = 1000;
        } else if (currency.equals(Currency.EUR)) {
            limit = 1200;
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
            limit = 10000;
        } else if (currency.equals(Currency.USD)) {
            limit = -1;
        } else {
            limit = 0;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate;
        final Currency currency = getCurrency();
        if (currency.equals(Currency.USD)) {
            rate = 1;
        } else if (currency.equals(Currency.EUR)) {
            rate = 2;
        } else {
            rate = 0;
        }
        return rate;
    }

    @Override
    public int getCommission(int summ) {
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
                commission = 6;
            } else {
                commission = 8;
            }
        } else {
            commission = 0;
        }
        return commission;
    }
}
