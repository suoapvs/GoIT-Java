package ua.goit.java.lesson03.task03;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Course {

    private final Date startDate;
    private final String name;
    private final int hoursDuration;
    private final String teacherName;

    public Course(final Date startDate, final String name) {
        this(name, 0, "", startDate);
    }

    public Course(final String name, final int hoursDuration, final String teacherName) {
        this(name, hoursDuration, teacherName, new Date());
    }

    public Course(
            final String name, final int hoursDuration,
            final String teacherName, final Date startDate
    ) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getName() {
        return this.name;
    }

    public int getHoursDuration() {
        return this.hoursDuration;
    }

    public String getTeacherName() {
        return this.teacherName;
    }
}
