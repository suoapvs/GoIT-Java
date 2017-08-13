package ua.goit.java.lesson02.task02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 2.1 Continue with BANK example
 * Write method which withdraws money from account and takes commission 5% of the transaction.
 * Print OK + commission + balance after withdrawal. Print NO is withdrawal is not possible.
 *
 * Example:
 * Input               Input
 * withdrawal = 10     balance = 100
 * withdrawal = 99     balance = 100
 * Output              Output
 * OK 0.5 89.5         NO
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Account account = new Account(1000);
        final int userNumber = 100;
        final Collection<Thread> users = createsUsers(account, userNumber);
        startUsers(users);
        joinUsers(users);
    }

    private static Collection<Thread> createsUsers(final Account account, final int size) {
        final List<Thread> users = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            users.add(createUser(account));
        }
        return users;
    }

    private static Thread createUser(final Account account) {
        return new Thread(() -> {
            sleep();
            final double money = System.nanoTime() % 100;
            final String status = account.withdraw(money);
            System.out.println(status);
        });
    }

    private static void startUsers(final Collection<Thread> users) {
        users.forEach(Thread::start);
    }

    private static void joinUsers(final Collection<Thread> users) {
        for (Thread user : users) {
            try {
                user.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
