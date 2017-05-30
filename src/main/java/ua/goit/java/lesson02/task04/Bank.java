package ua.goit.java.lesson02.task04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Bank {

    private final Map<String, Account> accounts = new HashMap<>();

    public void add(final Account account) {
        this.accounts.put(account.getOwner(), account);
    }

    public void addAll(final Collection<Account> accounts) {
        accounts.forEach(this::add);
    }

    public String withdraw(final String ownerName, final double money) {
        final Account account = this.accounts.get(ownerName);
        String result;
        if (account != null) {
            result = account.withdraw(money);
        } else {
            result = "NO";
        }
        return result;
    }

    public String fund(final String ownerName,final double money) {
        final Account account = this.accounts.get(ownerName);
        String result;
        if (account != null) {
            result = account.fund(money);
        } else {
            result = "NO";
        }
        return result;
    }
}
