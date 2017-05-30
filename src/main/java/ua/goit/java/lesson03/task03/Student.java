package ua.goit.java.lesson03.task03;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final int group;
    private final Course[] coursesTaken;
    private final int age;

    public Student(final String firstName, final String lastName, final int group) {
        this(firstName, lastName, group, new Course[0], 0);
    }

    public Student(final String lastName, final Course[] coursesTaken) {
        this("", lastName, 0, coursesTaken, 0);
    }

    protected Student(
            final String firstName, final String lastName,
            final int group, final Course[] coursesTaken, final int age
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getGroup() {
        return this.group;
    }

    public Course[] getCoursesTaken() {
        return this.coursesTaken;
    }

    public int getAge() {
        return this.age;
    }
}
