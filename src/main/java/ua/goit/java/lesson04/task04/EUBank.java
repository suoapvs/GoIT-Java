package ua.goit.java.lesson04.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class EUBank extends Bank {

    private static final int MIN_USD_COMMISSION = 5;
    private static final int MAX_USD_COMMISSION = 7;
    private static final int MIN_EUR_COMMISSION = 2;
    private static final int MAX_EUR_COMMISSION = 4;

    private final static int USD_LIMIT_WITHDRAWAL = 2000;
    private final static int EUR_LIMIT_WITHDRAWAL = 2200;

    private final static int USD_LIMIT_FUNDING = 20000;
    private final static int EUR_LIMIT_FUNDING = 10000;

    private final static int USD_MONTHLY_RATE = 0;
    private final static int EUR_MONTHLY_RATE = 1;

    public EUBank(
            long id, String bankCountry, Currency currency,
            int numberOfEmployees, double avrSalaryOfEmployee,
            long rating, long totalCapital) {
        super(
                id, bankCountry, currency, numberOfEmployees,
                avrSalaryOfEmployee, rating, totalCapital
        );
    }

    protected int getUSDCommission(final int summ) {
        return (summ < 1000) ? MIN_USD_COMMISSION : MAX_USD_COMMISSION;
    }

    protected int getEURCommission(final int summ) {
        return (summ < 1000) ? MIN_EUR_COMMISSION : MAX_EUR_COMMISSION;
    }

    protected int getUSDLimitOfWithdrawal() {
        return USD_LIMIT_WITHDRAWAL;
    }

    protected int getEURLimitOfWithdrawal() {
        return EUR_LIMIT_WITHDRAWAL;
    }

    protected int getUSDLimitOfFunding() {
        return USD_LIMIT_FUNDING;
    }

    protected int getEURLimitOfFunding() {
        return EUR_LIMIT_FUNDING;
    }

    protected int getUSDMonthlyRate() {
        return USD_MONTHLY_RATE;
    }

    protected int getEURMonthlyRate() {
        return EUR_MONTHLY_RATE;
    }
}
