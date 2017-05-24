package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(final User user, final int amount) {
        withdraw(user, amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        fund(user, amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        boolean result = withdraw(fromUser, amount);
        if (result) {
            fund(toUser, amount);
        }
    }

    @Override
    public void paySalary(User user) {
        final int salary = user.getSalary() * user.getMonthsOfEmployment();
        fund(user, salary);
    }

    private static boolean withdraw(final User user, final int amount) {
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

    private static boolean fund(User user, int amount) {
        final Bank bank = user.getBank();
        final int limitOfFunding = bank.getLimitOfFunding();
        final boolean result = (amount <= limitOfFunding);
        if (amount <= limitOfFunding) {
            user.setBalance(user.getBalance() + amount);
        }
        return result;
    }
}
