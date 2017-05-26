package ua.goit.java.lesson08.task04.entity;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class User {

    private final long id;

    private final String name;

    public User(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        User user = (User) object;
        return (this.id == user.id) &&
                (this.name != null ? this.name.equals(user.name) : user.name == null);
    }

    @Override
    public int hashCode() {
        int result = (int) (this.id ^ (this.id >>> 32));
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        return result;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
