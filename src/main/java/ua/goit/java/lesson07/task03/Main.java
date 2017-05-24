package ua.goit.java.lesson07.task03;

import java.util.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final TreeSet<Order> orders = createOrders(length);
        println(orders);

        final String userLastName = "Petrov";
        final boolean result = containsByUserLastName(orders, userLastName);
        System.out.println(result);

        final Order orderWithMaxPrice = getOrderWithMaxPrice(orders);
        System.out.println(orderWithMaxPrice);

        final Currency currency = Currency.USD;
        deleteCurrencyOrder(orders, currency);
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

    private static TreeSet<Order> createOrders(final int length) {
        final List<User> users = createUsers(length);
        final TreeSet<Order> orders = new TreeSet<>(createOrderComparator());
        Order temp = null;
        for (int i = 0; i < length - 1; i++) {
            temp = new Order(
                    i, i * 100,
                    (i % 2 == 0) ? Currency.UAH : Currency.USD,
                    "" + i, "" + i, users.get(i)
            );
            orders.add(temp);
        }
        orders.add(temp);
        return orders;
    }

    private static boolean containsByUserLastName(
            final Collection<Order> orders,
            final String userLastName
    ) {
        boolean result = false;
        for (Order order : orders) {
            if (order.getUser().getLastName().equals(userLastName)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static Order getOrderWithMaxPrice(final TreeSet<Order> orders) {
        Order orderWithMaxPrice = orders.first();
        for (Order order : orders) {
            if (orderWithMaxPrice.getPrice() < order.getPrice()) {
                orderWithMaxPrice = order;
            }
        }
        return orderWithMaxPrice;
    }

    private static Set<Order> deleteCurrencyOrder(
            final Set<Order> orders,
            final Currency currency
    ) {
        final Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(currency)) {
                iterator.remove();
            }
        }
        return orders;
    }

    private static Comparator<Order> createOrderComparator() {
        return (o1, o2) -> (int) (o1.getId() - o2.getId());
    }

    private static <T> void println(final Collection<T> objects) {
        objects.forEach(System.out::println);
    }
}
