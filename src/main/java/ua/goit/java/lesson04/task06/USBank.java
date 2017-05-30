package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class USBank extends Bank {

    private static final int MIN_USD_COMMISSION = 5;
    private static final int MAX_USD_COMMISSION = 7;
    private static final int MIN_EUR_COMMISSION = 6;
    private static final int MAX_EUR_COMMISSION = 8;
    private static final int LIMIT_COMMISSION = 1000;

    private final static int USD_LIMIT_WITHDRAWAL = 1000;
    private final static int EUR_LIMIT_WITHDRAWAL = 1200;

    private final static int USD_LIMIT_FUNDING = 10000;
    private final static int EUR_LIMIT_FUNDING = -1;

    private final static int USD_MONTHLY_RATE = 1;
    private final static int EUR_MONTHLY_RATE = 2;

    public USBank(
            long id, String bankCountry, Currency currency,
            int numberOfEmployees, double avrSalaryOfEmployee,
            long rating, long totalCapital) {
        super(
                id, bankCountry, currency, numberOfEmployees,
                avrSalaryOfEmployee, rating, totalCapital
        );
    }

    protected int getUSDCommission(final int summ) {
        return (summ < LIMIT_COMMISSION) ? MIN_USD_COMMISSION : MAX_USD_COMMISSION;
    }

    protected int getEURCommission(final int summ) {
        return (summ < LIMIT_COMMISSION) ? MIN_EUR_COMMISSION : MAX_EUR_COMMISSION;
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
