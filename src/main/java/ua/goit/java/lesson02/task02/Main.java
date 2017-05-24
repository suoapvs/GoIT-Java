package ua.goit.java.lesson02.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Account account = new Account(1000);
        final int userNumber = 100;
        final List<Thread> users = createsUsers(account, userNumber);
        startUsers(users);
        joinUsers(users);
    }

    private static List<Thread> createsUsers(final Account account, final int size) {
        final List<Thread> users = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            users.add(createUser(account));
        }
        return users;
    }

    private static Thread createUser(final Account account) {
        return new Thread(() -> {
            try {
                Thread.sleep(System.currentTimeMillis() % 50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(account.withdraw(System.nanoTime() % 100));
        });
    }

    private static void startUsers(final List<Thread> users) {
        users.forEach(Thread::start);
    }

    private static void joinUsers(final List<Thread> users) {
        for (Thread user : users) {
            try {
                user.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
