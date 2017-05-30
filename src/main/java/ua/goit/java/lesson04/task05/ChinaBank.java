package ua.goit.java.lesson04.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class ChinaBank extends Bank {

    private static final int MIN_USD_COMMISSION = 3;
    private static final int MAX_USD_COMMISSION = 5;
    private static final int MIN_EUR_COMMISSION = 10;
    private static final int MAX_EUR_COMMISSION = 11;
    private static final int LIMIT_COMMISSION = 1000;

    private final static int USD_LIMIT_WITHDRAWAL = 100;
    private final static int EUR_LIMIT_WITHDRAWAL = 150;

    private final static int USD_LIMIT_FUNDING = 5000;
    private final static int EUR_LIMIT_FUNDING = 10000;

    private final static int USD_MONTHLY_RATE = 1;
    private final static int EUR_MONTHLY_RATE = 0;

    public ChinaBank(
            final long id, final String bankCountry, final Currency currency,
            final int numberOfEmployees, final double avrSalaryOfEmployee,
            final long rating, final long totalCapital) {
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
