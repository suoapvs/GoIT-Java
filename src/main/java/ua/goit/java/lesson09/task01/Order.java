package ua.goit.java.lesson09.task01;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Order {

    private final long id;
    private final int price;
    private final Currency currency;
    private final String itemName;
    private final String shopIdentificator;
    private final User user;

    public Order(
            final long id, final int price, final Currency currency, final String itemName,
            final String shopIdentificator, final User user
    ) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", currency=" + this.currency +
                ", itemName='" + this.itemName + '\'' +
                ", shopIdentificator='" + this.shopIdentificator + '\'' +
                ", user=" + this.user +
                '}';
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

    public String getShopIdentificator() {
        return this.shopIdentificator;
    }

    public User getUser() {
        return this.user;
    }
}
