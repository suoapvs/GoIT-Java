package ua.goit.java.lesson04.task06;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
