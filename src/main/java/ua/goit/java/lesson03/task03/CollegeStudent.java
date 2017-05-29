package ua.goit.java.lesson03.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(final String firstName, final String lastName, final int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(final String lastName, final Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(
            final String firstName, final String lastName, final int group,
            final int age, final Course[] coursesTaken, final String collegeName,
            final int rating, final long id
    ) {
        this(firstName, lastName, group);
        setAge(age);
        setCoursesTaken(coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public void setCollegeName(final String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(final int rating) {
        this.rating = rating;
    }

    public long getId() {
        return this.id;
    }

    public void setId(final long id) {
        this.id = id;
    }
}
