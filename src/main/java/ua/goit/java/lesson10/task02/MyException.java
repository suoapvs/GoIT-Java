package ua.goit.java.lesson10.task02;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class MyException extends Exception {

    private final String message;

    public MyException(final String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
