package ua.goit.java.lesson03.task03;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(final Date startDate, final String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(final String name, final int hoursDuration, final String teacherName) {
        this(new Date(), name);
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return this.hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
