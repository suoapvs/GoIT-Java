package ua.goit.java.lesson08.task04.dao;

import ua.goit.java.lesson08.task04.entity.User;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class UserDAO extends AbstractDAOImpl<User> implements AbstractDAO<User> {

    @Override
    public void deleteById(final long id) {
        final User userToDelete = get(id);
        delete(userToDelete);
    }

    @Override
    public User get(final long id) {
        User result = null;
        for (User user : getList()) {
            if (user.getId() == id) {
                result = user;
                break;
            }
        }
        return result;
    }
}
