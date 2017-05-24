package ua.goit.java.lesson04.task01;

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
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        return 0;
    }

    @Override
    public int getCommission(int summ) {
        return 0;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
