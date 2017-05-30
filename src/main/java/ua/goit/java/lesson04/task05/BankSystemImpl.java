package ua.goit.java.lesson04.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(final User user, final int amount) {
        withdraw(user, amount);
    }

    @Override
    public void fundUser(final User user, final int amount) {
        fund(user, amount);
    }

    @Override
    public void transferMoney(final User fromUser, final User toUser, final int amount) {
        boolean result = withdraw(fromUser, amount);
        if (result) {
            fund(toUser, amount);
        }
    }

    @Override
    public void paySalary(final User user) {
        final int salary = user.getSalary() * user.getMonthsOfEmployment();
        fund(user, salary);
    }

    private boolean withdraw(final User user, final int amount) {
        final Bank bank = user.getBank();
        final int limitOfWithdrawal = bank.getLimitOfWithdrawal();
        final int commission = bank.getCommission(amount);
        final int withdrawal = amount * (1 + commission / 100);
        final boolean result = (withdrawal <= limitOfWithdrawal);
        if (result) {
            user.setBalance(user.getBalance() - withdrawal);
        }
        return result;
    }

    private boolean fund(final User user, final int amount) {
        final Bank bank = user.getBank();
        final int limitOfFunding = bank.getLimitOfFunding();
        final boolean result = (amount <= limitOfFunding);
        if (amount <= limitOfFunding) {
            user.setBalance(user.getBalance() + amount);
        }
        return result;
    }
}
