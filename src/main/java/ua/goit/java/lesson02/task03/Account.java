package ua.goit.java.lesson02.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Account {

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
        final boolean isPossible = withdrawWithCommission(withdraw);
        final String status;
        if (isPossible) {
            status = this.owner + " " + money + " " + this.money;
        } else {
            status = this.owner + " NO";
        }
        return status;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getMoney() {
        return this.money;
    }

    private double calcCommission(final double withdrawMoney) {
        return withdrawMoney * COMMISSION / 100;
    }

    private boolean withdrawWithCommission(final double withdraw) {
        final boolean isPossible = (withdraw <= this.money);
        if (isPossible) {
            this.money -= withdraw;
        }
        return isPossible;
    }
}
