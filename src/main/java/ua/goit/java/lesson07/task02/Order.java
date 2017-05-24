package ua.goit.java.lesson07.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Order {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(
            long id, int price, Currency currency, String itemName,
            String shopIdentificator, User user
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

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return this.shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
