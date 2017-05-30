package ua.goit.java.lesson07.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Order {

    private final long id;
    private final int price;
    private final Currency currency;
    private final String itemName;
    private final String shopId;
    private final User user;

    public Order(
            final long id, final int price, final Currency currency,
            final String itemName, final String shopId, final User user
    ) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopId = shopId;
        this.user = user;
    }

    public long getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getShopId() {
        return this.shopId;
    }

    public User getUser() {
        return this.user;
    }
}
