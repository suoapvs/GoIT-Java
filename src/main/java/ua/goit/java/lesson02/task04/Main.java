package ua.goit.java.lesson02.task04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int[] balances = { 1200, 250, 2000, 500, 3200 };
        final String[] ownerNames = { "Jane", "Ann", "Jack", "Oww", "Lane" };
        final List<Account> accounts = createAccounts(ownerNames, balances);
        final Bank bank = createBank(accounts);

        for (String owner : ownerNames) {
            final double money = System.nanoTime() % 1000;
            final String result = bank.fund(owner, money);
            System.out.println(result);
        }
    }

    private static List<Account> createAccounts(final String[] ownerNames, final int[] balances) {
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
