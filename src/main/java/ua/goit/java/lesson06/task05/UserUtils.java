package ua.goit.java.lesson06.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class UserUtils {

    public User[] uniqueUsers(final User[] users) {
        final User[] result = new User[users.length];
        System.arraycopy(users, 0, result, 0, users.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                for (int j = i + 1; j < result.length; j++) {
                    if (result[i].equals(result[j])) {
                        result[j] = null;
                    }
                }
            }
        }
        return deleteEmptyUsers(result);
    }

    public User[] usersWithContitionalBalance(final User[] users, final int balance) {
        int count = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                count++;
            }
        }
        final User[] result = new User[count];
        for (int i = 0; i < result.length; i++) {
            for (User user : users) {
                if (user.getBalance() == balance) {
                    result[i] = user;
                }
            }
        }
        return result;
    }

    public User[] paySalaryToUsers(final User[] users) {
        for (User user : users) {
            user.addBalance(user.getSalary());
        }
        return users;
    }

    public long[] getUsersId(final User[] users) {
        final long[] ids = new long[users.length];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = users[i].getId();
        }
        return ids;
    }

    public User[] deleteEmptyUsers(final User[] users) {
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count++;
            }
        }
        final User[] result = new User[count];
        for (int i = 0, j = 0; i < users.length; i++) {
            if (users[i] != null) {
                result[j] = users[i];
                j++;
            }
        }
        return result;
    }
}
