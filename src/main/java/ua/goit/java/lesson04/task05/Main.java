package ua.goit.java.lesson04.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Bank usBank1 = new USBank(11111, "USA", Currency.USD, 150, 3510.50, 10, 2500000);
        final Bank usBank2 = new USBank(11112, "USA", Currency.EUR, 100, 1250.50, 25, 1200000);
        final Bank euBank1 = new EUBank(22222, "France", Currency.USD, 85, 2500.20, 21, 200000);
        final Bank euBank2 = new EUBank(22221, "Ukraine", Currency.EUR, 15, 800.15, 125, 50000);
        final Bank chinaBank1 = new ChinaBank(33333, "China", Currency.USD, 125, 1500.10, 145, 615000);
        final Bank chinaBank2 = new ChinaBank(33332, "India", Currency.EUR, 58, 505.50, 145125, 15000);

        final User user1 = new User(1001, "Vasya", 10000, 5, "Google", 2000, usBank1);
        final User user2 = new User(1002, "Kolya", 11000, 4, "Yandex", 3000, usBank2);
        final User user3 = new User(1003, "Petya", 20100, 8, "Goit", 5000, euBank1);
        final User user4 = new User(1004, "Grisha", 20000, 9, "Zavod im.Lenina", 1000, euBank2);
        final User user5 = new User(1005, "Tolya", 15000, 6, "Velyka kyshenya", 500, chinaBank1);
        final User user6 = new User(1006, "Olya", 6300, 1, "Silpo", 2500, chinaBank2);
    }
}
