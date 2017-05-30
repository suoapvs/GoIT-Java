package ua.goit.java.lesson03.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class SpecialStudent extends CollegeStudent {

    private final long secretKey;
    private final String email;

    public SpecialStudent(final String firstName, final String lastName, final int group) {
        this(firstName, lastName, group, new Course[0], 0, "");
    }

    public SpecialStudent(final String lastName, final Course[] coursesTaken) {
        this("", lastName, 0, coursesTaken, 0, "");
    }

    public SpecialStudent(final long secretKey) {
        this("", "", 0, new Course[0], secretKey, "");
    }

    protected SpecialStudent(
            final String firstName, final String lastName, final int group,
            final Course[] coursesTaken, final long secretKey, final String email
    ) {
        super(firstName, lastName, group, 0, coursesTaken, "", 0, 0);
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return this.secretKey;
    }

    public String getEmail() {
        return this.email;
    }
}
