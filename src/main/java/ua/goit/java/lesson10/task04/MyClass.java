package ua.goit.java.lesson10.task04;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class MyClass {

    public void f() throws MySecondException {
        try {
            g();
        } catch (MyException ex) {
            throw new MySecondException(ex.getMessage());
        }
    }

    public void g() throws MyException {
        throw new MyException("");
    }
}
