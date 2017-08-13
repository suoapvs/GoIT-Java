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
        if (isNotNull(account)) {
            this.accounts.put(account.getOwner(), account);
        }
    }

    public void addAll(final Collection<Account> accounts) {
        accounts.forEach(this::add);
    }

    public String withdraw(final String ownerName, final double money) {
        final Account account = this.accounts.get(ownerName);
        final String status;
        if (isNotNull(account)) {
            status = account.withdraw(money);
        } else {
            status = "NO";
        }
        return status;
    }

    public String fund(final String ownerName, final double money) {
        final Account account = this.accounts.get(ownerName);
        final String status;
        if (isNotNull(account)) {
            status = account.fund(money);
        } else {
            status = "NO";
        }
        return status;
    }

    private boolean isNotNull(final Object object) {
        return object != null;
    }
}
