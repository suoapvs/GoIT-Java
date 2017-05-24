package ua.goit.java.lesson07.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final List<Order> orders = createOrders(length);
        sortByPrice(orders);
        println(orders);

        sortByPriceAndUserCity(orders);
        println(orders);

        sortByNameAndIdAndUserCity(orders);
        println(orders);

        deleteDublicates(orders);
        println(orders);

        deleteItemsPriceLess(orders, 1500);
        println(orders);
    }

    private static List<User> createUsers(final int length) {
        final List<User> users = new ArrayList<>();
        User temp;
        for (int i = 0; i < length; i++) {
            temp = new User(i, "Name " + i, "Lastname " + i, "City " + i, i * 100);
            users.add(temp);
        }
        return users;
    }

    private static List<Order> createOrders(final int length) {
        final List<User> users = createUsers(length);
        final List<Order> orders = new ArrayList<>();
        Order temp;
        for (int i = 0; i < length; i++) {
            temp = new Order(
                    i, i * 100,
                    (i % 2 == 0) ? Currency.UAH : Currency.USD,
                    "" + i, "" + i, users.get(i)
            );
            orders.add(temp);
        }
        return orders;
    }

    private static void sortByPrice(final List<Order> orders) {
        Collections.sort(orders, (o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    private static void sortByPriceAndUserCity(final List<Order> orders) {
        Collections.sort(orders, (o1, o2) -> {
            int res = o2.getPrice() - o1.getPrice();
            if (res == 0) {
                res = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return res;
        });
    }

    private static void sortByNameAndIdAndUserCity(final List<Order> orders) {
        Collections.sort(orders, (o1, o2) -> {
            int res = o1.getItemName().compareTo(o2.getItemName());
            if (res == 0) {
                res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (res == 0) {
                    res = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
            }
            return res;
        });
    }

    public static void deleteDublicates(final List<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(i).equals(orders.get(j))) {
                    orders.remove(orders.get(j));
                }
            }
        }
    }

    public static void deleteItemsPriceLess(final List<Order> orders, final int price) {
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getPrice() < price) {
                orders.remove(orders.get(i));
            }
        }
    }

    public static void separateForCurrency(
            final List<Order> orders,
            final List<Order> ordersUSD,
            final List<Order> ordersUAH
    ){
        for (Order order : orders) {
            if (order.getCurrency().equals(Currency.USD)) {
                ordersUSD.add(order);
            } else if (order.getCurrency().equals(Currency.UAH)) {
                ordersUAH.add(order);
            }
        }
    }

    private static <T> void println(final List<T> objects) {
        objects.forEach(System.out::println);
    }
}
