package ua.goit.java.lesson03.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(final String firstName, final String lastName, final int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(final String lastName, final Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(final long secretKey) {
        this(null, null);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(final long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
