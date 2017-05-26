package ua.goit.java.lesson08.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public T save(final T t) {
        this.list.add(t);
        return t;
    }

    @Override
    public void delete(final T t) {
        this.list.remove(t);
    }

    @Override
    public void deleteAll(final List<T> list) {
        this.list.removeAll(list);
    }

    @Override
    public void saveAll(final List<T> list) {
        this.list.addAll(list);
    }

    @Override
    public List<T> getList() {
        return new ArrayList<>(this.list);
    }
}
