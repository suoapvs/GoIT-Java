package ua.goit.java.lesson02.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Account {

    private final static int COMMISSION = 5;

    private final Object lock = new Object();

    private double money;

    public Account(final double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object object) {
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
        synchronized (this.lock) {
            final boolean result = withdrawWithCommission(withdraw);
            if (result) {
                return "OK " + commission + " " + this.money;
            } else {
                return "NO";
            }
        }
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
