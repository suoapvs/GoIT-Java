package ua.goit.java.lesson03.task01;

/**
 * 3.1 Добавить метод sing к классу Bird, потом измените основной метод соответственно,
 * чтобы код вывел следующий текст:
 * ```
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 * ```
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Bird bird = new Bird();
        bird.sing("walking");
        bird.sing("flying");
        bird.sing("singing");
        bird.sing("Bird");
    }
}
