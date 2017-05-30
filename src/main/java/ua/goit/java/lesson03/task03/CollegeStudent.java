package ua.goit.java.lesson03.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class CollegeStudent extends Student {

    private final String collegeName;
    private final int rating;
    private final long id;

    public CollegeStudent(final String firstName, final String lastName, final int group) {
        this(firstName, lastName, group, 0, new Course[0], "", 0, 0);
    }

    public CollegeStudent(final String lastName, final Course[] coursesTaken) {
        this("", lastName, 0, 0, coursesTaken, "", 0, 0);
    }

    protected CollegeStudent(
            final String firstName, final String lastName, final int group,
            final int age, final Course[] coursesTaken, final String collegeName,
            final int rating, final long id
    ) {
        super(firstName, lastName, group, coursesTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public int getRating() {
        return this.rating;
    }

    public long getId() {
        return this.id;
    }
}
