package ua.goit.java.lesson10.task05;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class MyClass {

    public void throwsRandomException() throws FirstException, SecondException, ThirdException {
        switch ((int) (System.nanoTime() % 3)) {
        case 0:
            throw new FirstException();
        case 1:
            throw new SecondException();
        case 2:
            throw new ThirdException();
        }
    }
}
