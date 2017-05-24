package ua.goit.java.lesson06.task06;

import java.util.Arrays;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final User[] users1 = {
                null,
                new User(1, "Vasya", "Pypkin", 2500, 10),
                new User(2, "Petya", "Ivanov", 2000, 10000),
                new User(3, "Grisha", "Ternov", 1000, 200),
                new User(4, "Kolya", "Kovalenko", 1500, 200),
                new User(5, "Grisha", "Ternov", 1000, 200),
                new User(6, "Petya", "Ivanov", 2000, 10000)
        };
        System.out.println(Arrays.toString(users1));

        final User[] users = UserUtils.deleteEmptyUsers(users1);
        System.out.println(Arrays.toString(users));

        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users, 200)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
    }
}
