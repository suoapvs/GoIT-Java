package ua.goit.java.lesson03.task03;

import java.util.Date;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Solution {

    public static void main(String[] args) {
        final Course one = new Course(new Date(), "CurrencyExchange");
        final Course two = new Course("Second", 10, "Petrov");
        final Course three = new Course("Third", 15, "Ivanov");
        final Course four = new Course(new Date(), "Forth");
        final Course five = new Course("Fifth", 25, "Pupkin");

        final Course[] core = { one, two, three };
        final Course[] medium = { two, three };
        final Course[] prof = { three, four, five };

        final Student student1 = new Student("Igor", "Novikov", 2);
        final Student student2 = new Student("Sidorov", core);

        final CollegeStudent collegeStudent1 = new CollegeStudent("Tolya", "Karavaev", 5);
        final CollegeStudent collegeStudent2 = new CollegeStudent("Gernenko", medium);
        final CollegeStudent collegeStudent3 = new CollegeStudent("Grisha", "Mashkin", 4, 35, prof, "NTU", 1, 1L);

        final SpecialStudent specialStudent1 = new SpecialStudent("Kolya", "Dub", 1);
        final SpecialStudent specialStudent2 = new SpecialStudent("Gorenko", prof);
        final SpecialStudent specialStudent3 = new SpecialStudent(123L);
    }
}
