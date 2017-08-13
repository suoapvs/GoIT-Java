package ua.goit.java.lesson02.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Account {

    private final static int COMMISSION = 5;

    private double money;

    public Account(final double money) {
        this.money = money;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Account account = (Account) object;
        return Double.compare(account.money, money) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(money);
        return (int) (temp ^ (temp >>> 32));
    }

    public synchronized String withdraw(final double money) {
        final double commission = calcCommission(money);
        final double withdraw = money + commission;
        final boolean isPossible = withdrawWithCommission(withdraw);
        final String status;
        if (isPossible) {
            status = "OK " + commission + " " + this.money;
        } else {
            status = "NO";
        }
        return status;
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
