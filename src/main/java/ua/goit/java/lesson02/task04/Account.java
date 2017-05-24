package ua.goit.java.lesson02.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Account {

    private final static int COMMISSION = 5;

    private final String owner;

    private double money;

    public Account(final String owner, final double money) {
        this.owner = owner;
        this.money = money;
    }

    public synchronized String withdraw(final double money) {
        final double commission = calcCommission(money);
        final double withdraw = money + commission;
        final boolean result = withdrawWithCommission(withdraw);
        String message;
        if (result) {
            message = this.owner + " " + money + " " + this.money;
        } else {
            message = this.owner + " NO";
        }
        return message;
    }

    public synchronized String fund(final double money) {
        boolean result = fundBalance(money);
        String message;
        if (result) {
            message = "OK " + this.money;
        } else {
            message = "NO";
        }
        return message;
    }

    private boolean fundBalance(final double money) {
        boolean result = (money > 0);
        if (result) {
            this.money += money;
        }
        return result;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getMoney() {
        return this.money;
    }

    private static double calcCommission(final double withdrawMoney) {
        return withdrawMoney * COMMISSION / 100;
    }

    private boolean withdrawWithCommission(final double withdraw) {
        final boolean result = (withdraw <= this.money);
        if (result) {
            this.money -= withdraw;
        }
        return result;
    }
}
