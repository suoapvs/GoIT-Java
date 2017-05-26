package ua.goit.java.lesson08.task02;

import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public interface AbstractDAO<T> {

    T save(T t);

    void delete(T t);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getList();

    void deleteById(long id);

    T get(long id);
}
