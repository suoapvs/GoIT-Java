package ua.goit.java.lesson09.task01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final List<Order> orders = createOrdersWithDuplicates(length);
        sortByPrice(orders);
        println(orders);

        sortByPriceAndUserCity(orders);
        println(orders);

        sortByNameAndIdAndUserCity(orders);
        println(orders);

        final List<Order> distinctOrders = deleteDuplicates(orders);
        println(distinctOrders);

        final int price = 1500;
        final List<Order> ordersPriceLess = deleteOrdersPriceLess(orders, price);
        println(ordersPriceLess);
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

    private static List<Order> createOrdersWithDuplicates(final int length) {
        final List<User> users = createUsers(length);
        final List<Order> orders = new ArrayList<>();
        Order temp;
        for (int i = 0; i < length / 2; i++) {
            temp = new Order(
                    i, (int) (System.nanoTime() % 2000),
                    (i % 2 == 0) ?
                            Currency.UAH :
                            Currency.USD,
                    "" + i, "" + i, users.get(i)
            );
            orders.add(temp);
            orders.add(temp);
        }
        Collections.shuffle(orders);
        return orders;
    }

    private static void sortByPrice(final List<Order> orders) {
        Collections.sort(orders, (o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    private static void sortByPriceAndUserCity(final List<Order> orders) {
        Collections.sort(orders, (order1, order2) -> {
            int result = order2.getPrice() - order1.getPrice();
            if (result == 0) {
                result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
            }
            return result;
        });
    }

    private static void sortByNameAndIdAndUserCity(final List<Order> orders) {
        Collections.sort(orders, (order1, order2) -> {
            int result = order1.getItemName().compareTo(order2.getItemName());
            if (result == 0) {
                result = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
                if (result == 0) {
                    result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
                }
            }
            return result;
        });
    }

    private static List<Order> deleteDuplicates(final List<Order> orders) {
        return orders.stream().distinct().collect(Collectors.toList());
    }

    private static List<Order> deleteOrdersPriceLess(final List<Order> orders, final int price) {
        return orders.stream()
                .filter(order -> order.getPrice() > price)
                .collect(Collectors.toList());
    }

    private static Map separateForCurrency(final List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(Order::getCurrency));
    }

    public static Map separateForUserCity(List<? extends Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }

    private static boolean containsByUserLastName(
            final Collection<Order> orders,
            final String userLastName
    ) {
        return orders.stream()
                .filter(order -> order.getUser().getLastName().equals(userLastName))
                .findAny().isPresent();
    }

    private static <T> void println(final List<T> objects) {
        objects.forEach(System.out::println);
    }
}
