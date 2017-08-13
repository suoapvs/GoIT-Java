package ua.goit.java.lesson03.task02;

/**
 * 3.2 Напишите класс с названием Arithmetic с методом add, который принимает целые
 * числа как параметры и возвращает переменную типа integer, которая есть их суммой.
 * <p>
 * Напишите класс Adder, который наследуется от класса Arithmetic.
 * У класса Adder должен быть метод check, который сравнивает 2 номера и возвращает true,
 * если а>=b и false в других случаях.
 * <p>
 * Сигнатура методов:
 * ```
 * int add(Integer a, Integer b)
 * boolean check(Integer a, Integer b)
 * ```
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int a = 5;
        final int b = 10;

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(a, b));

        final Adder adder = new Adder();
        System.out.println(adder.check(a, b));
    }
}
