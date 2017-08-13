package ua.goit.java.lesson02.task03;

import java.util.*;

/**
 * 2.3 You need to write method which withdraw money of particular account owner if he/she can.
 * Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal
 * in other case. Commission is 5% for all cases.
 * <p>
 * Example:
 * <p>
 * Input:
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 * String ownerName = Ann;
 * double withdrawal = 100;
 * <p>
 * Output:
 * Ann 100 145
 * <p>
 * -----------------------------------------------------------------------
 * <p>
 * Input:
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 * String ownerName = Oww;
 * double withdrawal = 490;
 * <p>
 * Output:
 * Oww NO
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int[] balances = { 1200, 250, 2000, 500, 3200 };
        final String[] ownerNames = { "Jane", "Ann", "Jack", "Oww", "Lane" };
        final Collection<Account> accounts = createAccounts(ownerNames, balances);
        final Bank bank = createBank(accounts);

        for (String owner : ownerNames) {
            final double money = System.nanoTime() % 1000;
            final String status = bank.withdraw(owner, money);
            System.out.println(status);
        }
    }

    private static Collection<Account> createAccounts(final String[] ownerNames, final int[] balances) {
        final List<Account> accounts = new ArrayList<>();
        Account temp;
        for (int i = 0; i < ownerNames.length; i++) {
            temp = createAccount(ownerNames[i], balances[i]);
            accounts.add(temp);
        }
        return accounts;
    }

    private static Account createAccount(final String owner, final double money) {
        return new Account(owner, money);
    }

    private static Bank createBank(final Collection<Account> accounts) {
        final Bank bank = new Bank();
        bank.addAll(accounts);
        return bank;
    }
}
